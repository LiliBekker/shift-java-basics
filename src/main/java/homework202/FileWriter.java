package homework202;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriter {

    public static void writeToFile(String content, String fileName) {

        java.io.FileWriter fileOutputStream = null;

        try {
            // открыть файл
            fileOutputStream = new java.io.FileWriter(fileName);

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