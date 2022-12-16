package laba3;

import java.util.Scanner;
//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.
public class Example1 {

    public static void main(String[] args) {
        System.out.println("Введите целое число в диапазоне от 1 до 7: ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели: " + number + " - понедельник");
                break;
            case 2:
                System.out.println("Вы ввели: " + number + " - вторник");
                break;
            case 3:
                System.out.println("Вы ввели: " + number + " - среда");
                break;
            case 4:
                System.out.println("Вы ввели: " + number + " - четверг");
                break;
            case 5:
                System.out.println("Вы ввели: " + number + " - пятница");
                break;
            case 6:
                System.out.println("Вы ввели: " + number + " - суббота");
                break;
            case 7:
                System.out.println("Вы ввели: " + number + " - воскресенье");
            default:
                System.out.println("Введены некоррректные данные");

        }
    }
}

