package laba2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int num = x / 5;
        if (num == 2) {
            System.out.println("Введенное число делится на 5 c остатком 2");
        } else {
            System.out.println("Введенное число не делиться на 5 с остатком 2");
        }
        int num1 = x / 7;
        if (num1 == 1) {
            System.out.println("Введенное число делится на 7 c остатком 1");
        } else {
            System.out.println("Введенное число не делиться на 7 с остатком 1");
        }
        in.close();
    }
}
