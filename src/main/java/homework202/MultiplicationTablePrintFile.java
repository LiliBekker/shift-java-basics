package homework202;

import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTablePrintFile {

    public static void writeToFile(String content, String fileName) {

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}