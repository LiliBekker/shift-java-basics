package homework201;

import java.util.Scanner;

public class ConsoleStringReader {

    private final Scanner scanner = new Scanner(System.in);

    public String inputStringWithConsole() {
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
        inputChar = scanner.nextLine();
        while (inputChar.trim().isEmpty()) {
            System.out.println("Введенный символ не допускается для замены. Введите повторно символ:");
            inputChar = scanner.nextLine();
        }

        return inputChar.charAt(0);
    }
}