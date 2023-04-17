package laba12;

/* Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки,которые содержат только буквы (без цифр и символов).*/

public class Example9 {

        public static boolean isAlpha(String s)
        {
            if (s == null) {
                return false;
            }

            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args)
        {
            String s = "ABCD";
            String r = "@@@@";
            System.out.println("Строка состоит только из букв: " + isAlpha(s) + "\n" +
                    "Вторая строка: "+ isAlpha(r));
        }
}
