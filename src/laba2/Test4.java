package laba2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Вести число");
        int x = in.nextInt();
        int a = 4;
        int b = 11;

            if (a < x & x < b) {
                System.out.println("попадает в диапазон от 5 да 10");
            } else {
                System.out.println("Введенное число введено неверно!");
                in.close();
            }
    }
}
