package Laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {
    //Напишите программу «Шифр Цезаря», в которой
    //необходимо реализовать собственный алфавит, остальные условия идентичны
    //задаче 8.
        private static class Caeser {
            static char alphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                    'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
            static String encryptText;

            private static String encrypt(String enText, int key) {
                char[] ArrayText = enText.toCharArray();
                char[] CharCode = new char[ArrayText.length];
                for (int i = 0; i < ArrayText.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (ArrayText[i] == alphabet[j]) {
                            CharCode[i] = alphabet[(j + key) % 33];
                        } else if (CharCode[i] == 0) {
                            CharCode[i] = '*';
                        }
                    }
                }
                for (int i = 0; i < ArrayText.length; i++) {
                    ArrayText[i] = (char) CharCode[i];
                }
                encryptText = new String(ArrayText);
                return encryptText;
            }

            private static String decrypt(String enText, int key) {
                char[] ArrayText = enText.toCharArray();
                int[] CharCode = new int[ArrayText.length];
                for (int i = 0; i < ArrayText.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (ArrayText[i] == alphabet[j]) {
                            CharCode[i] = alphabet[(j - key) % 33];
                        } else if (CharCode[i] == '*') {
                            CharCode[i] = '*';
                        }
                    }
                }
                for (int i = 0; i < ArrayText.length; i++) {
                    ArrayText[i] = (char) CharCode[i];
                }
                encryptText = new String(ArrayText);
                return encryptText;
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите текст для шифрования: ");
            String value = in.nextLine();

            System.out.println("Введите ключ шифрования: ");
            int key = in.nextInt();

            char[] chars = value.toCharArray();
            int [] ints = new int[value.length()];

            for (int i = 0; i < chars.length; i++) {
                ints[i] = chars[i] + key;
            }
            for (int i = 0; i < chars.length; i++){
                chars[i] = (char) ints[i];
            }
            System.out.println(Arrays.toString(chars).replace("[","").replace(",","").replace("]",""));

            System.out.println("Выполнить обратное преобразование? (Y/N) ");
            boolean answer = false;

            while (!answer){
                String reply = in.next();

                if (reply.toLowerCase().equals("y")) {
                    for (int i = 0; i < chars.length; i++) {
                        ints[i] = chars[i] - key;
                    }
                    for (int i = 0; i < chars.length; i++){
                        chars[i] = (char) ints[i];
                    }
                    System.out.println(Arrays.toString(chars).replace("[","").replace(",","").replace("]",""));
                    answer = true;
                }
                else if (reply.toLowerCase().equals("n")) {
                    System.out.println("До свидания!");
                    answer = true;
                }
                else {
                    System.out.println("Введите корректный ответ: ");
                    answer = false;
                }
            }
        }
}
