package homework201;

public class TextTransformerApp {

    public static void main(String[] args) {

        ConsoleStringReader input = new ConsoleStringReader();
        CharacterReplacer replacer = new CharacterReplacer();

        System.out.println("""
                Допустимые символы в строке:
                - буквы латиницы и кириллицы
                - знаки препинания: . , ! ? : ;
                - пробелы (только одиночные, без подряд идущих)
                """);
        String original = input.inputStringFromConsole();

        char target = input.inputCharWithConsole();

        String result = replacer.getStringWithCharacterReplacement(original, target);

        System.out.println("Исходная: " + original + " | Результат: " + result);

        if (original.equals(result)) {
            System.out.println("\nСтрока не изменилась после преобразований");
        }
    }
}