package homework201;

import java.util.Scanner;

public class ConsoleStringReader {

    private final Scanner scanner = new Scanner(System.in);

    public String inputStringFromConsole() {
        String inputString;
        while (true) {
            System.out.print("Введите строку: ");
            inputString = scanner.nextLine();
            boolean validLength = inputString.trim().length() > 1;
            boolean validChars = inputString.matches("[a-zA-Zа-яА-ЯёЁ.,!?;: ]+");

            if (validLength && validChars) {
                break;
            }
            System.out.println("Введена строка с недопустимыми символами. Введите корректную строку");
        }
        return inputString;
    }

    public char inputCharWithConsole() {
        String inputChar;
        System.out.print("Введите символ: ");
        while (true) {
            inputChar = scanner.nextLine();
            if (inputChar.length() == 1 && inputChar.charAt(0) != ' ' && inputChar.matches("[a-zA-Zа-яА-ЯёЁ.,!?;:]")) {
                return inputChar.charAt(0);
            }
            System.out.println("Необходимо ввести ровно один символ, отличный от пробела.");
        }
    }
}