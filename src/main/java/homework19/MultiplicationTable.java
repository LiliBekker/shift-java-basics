package homework19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        System.out.println("Таблица умножения для целых чисел");
        getMultiplicationTableParametersFromConsole();
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
    public static void getMultiplicationTableParametersFromConsole() {
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

        printMultiplicationTable(first, second, step);
    }

    // Функция для генерации диапазона с заданным шагом
    private static List<Integer> buildRange(int first, int second, int step) {
        List<Integer> numbers = new ArrayList<>();

        // учитываем порядок записи чисел (по убыванию/возрастанию, зависит от того как введены числа в консоль
        if (first <= second) {
            for (int i = first; i <= second; i += step) {
                numbers.add(i);
            }
        } else {
            for (int i = first; i >= second; i -= step) {
                numbers.add(i);
            }
        }

        // учитываем граничные значения
        if (numbers.get(numbers.size() - 1) != second) {
            numbers.add(second);
        }

        return numbers;
    }

    // функция для подсчета длины значения в таблице
    public static int getCellWidth(int number) {
        return String.valueOf(number).length();
    }

    // Функция для печати таблицы на консоль
    public static void printMultiplicationTable(int first, int second, int step) {
        List<Integer> numbers = buildRange(first, second, step);

        int maxAbsMultiplication = 0;
        for (int a : numbers) {
            for (int b : numbers) {
                maxAbsMultiplication = Math.max(maxAbsMultiplication, Math.abs(a * b));
            }
        }

        // учитываем пробелы
        int cellWidth = getCellWidth(maxAbsMultiplication) + 2;

        // заголовок таблицы
        System.out.printf("%" + cellWidth + "s", "");
        for (int num : numbers) {
            System.out.printf("%" + cellWidth + "d", num);
        }
        System.out.println();

        // тело таблицы
        for (int row : numbers) {
            System.out.printf("%" + cellWidth + "d", row);

            for (int col : numbers) {
                int result = row * col;
                System.out.printf("%" + cellWidth + "d", result);
            }
            System.out.println();
        }
    }
}