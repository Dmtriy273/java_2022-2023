package laba1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваше имя: ");
        String Name = in.nextLine();

        System.out.println("Ваш год рождения: ");
        int num = in.nextInt();
        int years = LocalDateTime.now().getYear() - num;

        System.out.println("Name: " + Name);
        System.out.println("Ваше имя: " + Name + ", Ваш возраст: " + years);
    }
}