package laba8.task2;
/*
    Создать проект, позволяющий из одного, предварительно созданного программными средствами файла,
    переписать данные, соответствующие условию -
    в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
    В результирующий файл переписать вторую строку и положительные числа.
 */

import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\laba8\\Task2\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("src\\laba8\\Task2\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                    System.out.println(lineCount + ": " + s);
                }
                for (int i = 0; i < s.split(" ").length; i++) {
                    if (isNumber(s.split(" ")[i])){
                        double d = Double.parseDouble(s.split(" ")[i]);
                        if (d>=0){
                            out.println(i + ": " + d);
                            System.out.println(i + ": " + d);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
    public static boolean isNumber(String s) {
        try {
            double i = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
