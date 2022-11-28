package laba1;

import java.util.Scanner;

public class Example13 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Вести число №1: ");
        int num1 = in.nextInt();
        System.out.println("Вести число №2: ");
        int num2 = in.nextInt();
        int num3 = num1+num2;

        System.out.println("Сумма: " + num3);
        in.close();
    }
}
