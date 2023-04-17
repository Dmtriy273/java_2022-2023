package laba12;

/*Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые имеют длину больше заданного значения.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Example7 {

        public static void main(String[] args) throws IOException
        {
            System.out.println("Введите 3 строки");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            ArrayList<String> strings = new ArrayList<String>();

            for (int i = 0; i < 3; i++) {

                String s = reader.readLine();

                strings.add(0, s);

            }

            for (int i = 0; i < 3; i++) {

                if (strings.get(i).length() > 5) {

                    strings.set(0, strings.get(i));
                    System.out.println("Строка, где больше 5 элементов:");
                    System.out.println(strings.get(0));

                }

            }
        }
}
