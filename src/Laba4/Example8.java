package Laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования : ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ»
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


