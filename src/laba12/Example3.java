package laba12;

/* Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые начинаются с большой буквы.*/

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

        public static void main(String[] args) {
            String string = "Напишите функцию, которая принимает на вход список " +
                    "строк и возвращает новый список, Содержащий только те строки, " +
                    "которые Начинаются с большой буквы";

            List<String> strings = List.of(string.split(" "));
            System.out.println("\n" + "Строка после сплитования : " + "\n");
            for (String e : strings) {
                System.out.println(e);
            }

            List<String> stringsAfter = funcString(strings);

            System.out.println("\n" + "Строка после преобразования : " + "\n");
            for (String e : stringsAfter) {
                System.out.println(e);
            }
        }

        public static List<String> funcString(List<String> strings) {
            return strings.stream().filter(a -> Character.isUpperCase(a.charAt(0))).collect(Collectors.toList());
        }
}
