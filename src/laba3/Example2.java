package laba3;

import java.util.Scanner;

public class Example2 {
//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch
    public static void main(String[] args) {
        System.out.println("Введи день недели: ");
        Scanner in = new Scanner(System.in);
        String dayOfWeek = in.nextLine();
        String s = dayOfWeek.toLowerCase();

        System.out.println("Результат с использованием выбора switch.");

        switch (s) {
            case "Понедельник", "пн":
                System.out.println("Понедельник, порядковый номер - 1");
                break;
            case "вторник", "вт":
                System.out.println("Вторник, порядковый номер - 2");
                break;
            case "среда", "ср":
                System.out.println("Среда, порядковый номер - 3");
                break;
            case "четверг", "чт":
                System.out.println("Четверг, порядковый номер - 4");
                break;
            case "пятница", "пт":
                System.out.println("Пятница, порядковый номер - 5");
                break;
            case "суббота", "сб":
                System.out.println("Суббота, порядковый номер - 6");
                break;
            case "воскресенье", "вс":
                System.out.println("Воскресенье, порядковый номер - 7");
            default:
                System.out.println("\n такого дня нет");

        }
        System.out.println("Результат выполнения кода с использованием вложенных условных операторов.");

        if (s.equals("понедельник") || s.equals("пн")) {
            System.out.println("Понедельник, порядковый номер - 1");
        } else if (s.equals("вторник") || s.equals("вт")) {
            System.out.println("Вторник, порядковый номер - 2");
        } else if (s.equals("среда") || s.equals("ср")) {
            System.out.println("Среда, порядковый номер - 3");
        } else if (s.equals("четверг") || s.equals("чт")) {
            System.out.println("Четверг, порядковый номер - 4");
        } else if (s.equals("пятница") || s.equals("пт")) {
            System.out.println("Понедельник, порядковый номер - 5");
        } else if (s.equals("суббота") || s.equals("сб")) {
            System.out.println("Суббота, порядковый номер - 6");
        } else if (s.equals("воскресенье") || s.equals("вс")) {
            System.out.println("Воскресенье, порядковый номер - 7");
        } else System.out.println("такого дня нет, проверьте введенные данные");
    }
}
