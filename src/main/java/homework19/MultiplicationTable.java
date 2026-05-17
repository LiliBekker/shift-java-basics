package homework19;

import homework202.MultiplicationTablePrintFile;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        String table = getMultiplicationTableParametersFromConsole();

        System.out.println("Таблица умножения для целых чисел");
        System.out.println(table);

        String fileName = "multiplication_table.txt";
        System.out.println("Таблица умножения записана в файл: " + fileName);
        MultiplicationTablePrintFile.writeToFile(table, fileName);
    }

    // Функция для ввода целых чисел с клавиатуры
    public static int inputInt(String text) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(text);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число");
                scanner.nextLine();
            }
        }
    }

    // Функция для создания таблицы умножения
    public static String getMultiplicationTableParametersFromConsole() {

        int first = inputInt("Введите первое число: ");
        int second = inputInt("Введите второе число: ");

        int step;
        int range = Math.abs(first - second);

        while (true) {
            step = inputInt("Введите шаг: ");

            if (step <= 0) {
                System.out.println("Шаг должен быть больше 0");
                continue;
            }

            if (range != 0 && step > range) {
                System.out.println("Шаг не может быть больше диапазона чисел (" + range + ")");
                continue;
            }

            break;
        }

        return buildMultiplicationTable(first, second, step);
    }

    // Функция для генерации диапазона с заданным шагом
    private static List<Integer> buildRange(int first, int second, int step) {
        List<Integer> numbers = new ArrayList<>();

        if (first <= second) {
            for (int i = first; i <= second; i += step) {
                numbers.add(i);
            }
        } else {
            for (int i = first; i >= second; i -= step) {
                numbers.add(i);
            }
        }

        if (numbers.getLast() != second) {
            numbers.add(second);
        }

        return numbers;
    }

    // функция для подсчета длины значения в таблице
    public static int getCellWidth(int number) {
        return String.valueOf(number).length();
    }

    // Функция для построения таблицы
    public static String buildMultiplicationTable(int first, int second, int step) {

        List<Integer> numbers = buildRange(first, second, step);
        StringBuilder table = new StringBuilder();

        int maxAbsMultiplication = 0;

        for (int a : numbers) {
            for (int b : numbers) {
                maxAbsMultiplication = Math.max(
                        maxAbsMultiplication,
                        Math.abs(a * b)
                );
            }
        }

        int cellWidth = getCellWidth(maxAbsMultiplication) + 2;

        table.append(String.format("%" + cellWidth + "s", ""));

        for (int num : numbers) {
            table.append(String.format("%" + cellWidth + "d", num));
        }

        table.append("\n");

        for (int row : numbers) {
            table.append(String.format("%" + cellWidth + "d", row));

            for (int col : numbers) {
                table.append(String.format("%" + cellWidth + "d", row * col));
            }

            table.append("\n");
        }

        return table.toString();
    }
}