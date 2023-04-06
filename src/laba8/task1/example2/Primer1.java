package laba8.task1.example2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer1 {
    //метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte (InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1) { //признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            //с потоком связан файл
            InputStream inputFile = new FileInputStream("src\\laba8\\task1\\example2\\text.txt");
            readAllByByte(inputFile);
            System.out.print("\n\n\n");
            inputFile.close();

            InputStream inputUrl = new URL("https://www.google.ru/").openStream();
            readAllByByte(inputUrl);
            System.out.print("\n\n\n");
            inputUrl.close();

            InputStream inputArr = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inputArr);
            System.out.print("\n\n\n");
            inputArr.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
