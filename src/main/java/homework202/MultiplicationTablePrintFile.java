package homework202;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTablePrintFile {

    public static void writeToFile(String content, String fileName) {

        FileWriter fileOutputStream = null;

        try {
            // открыть файл
            fileOutputStream = new FileWriter(fileName);

            // записать в файл
            fileOutputStream.write(content);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        } finally {
            // Закрыть файл
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}