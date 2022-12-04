package laba2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Вести число");
        int x = in.nextInt();

        int num = (x % 4);

        if (num == 0)
        if (x > 10) {
            System.out.println("Делится на 4 и введённое число больше 10");
        } else {
            System.out.println("Введенное число неверно");
            in.close();
        }

    }
}