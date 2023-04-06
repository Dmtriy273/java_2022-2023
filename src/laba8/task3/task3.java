package laba8.task3;

import java.io.*;

/*
Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String)
заранее подготовленного текста на русском языке (Пушкин, Лермонтов или другой российсмки классик на Ваш вкус),
построчно переписать в другой текстовый файл слова начинающиеся с согласных букв.
 */
public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\laba8\\Task3\\MyFile1.txt")));
            out = new PrintWriter("src\\laba8\\Task3\\MyFile2.txt");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int rowCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].matches("(?ui:[^аеёиоуыэюя]).*")) {
                        out.print(arr[i] + " ");
                        rowCount++;
                    }
                }
                out.println("\n Колличество слов в строке " + lineCount + ": " + rowCount);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
