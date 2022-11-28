package laba1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Ваш год рождения: ");
        int num = in.nextInt();
        int years = LocalDateTime.now().getYear() - num;
        System.out.println("Ваш возраст: " + years);
        in.close();
    }
}
