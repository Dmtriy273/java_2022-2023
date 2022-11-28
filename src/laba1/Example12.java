package laba1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько Вам лет? ");
        int num = in.nextInt();
        int years = LocalDateTime.now().getYear() - num;

        System.out.println("Ваш год рождания: " + years);
        in.close();
    }
}
