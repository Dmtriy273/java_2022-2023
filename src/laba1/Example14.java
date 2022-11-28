package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        int a = num-1;
        int b = num;
        int c = num+1;
        int d = (a + b + c)*(a + b + c);

        System.out.println(a+"," +b+ "," +c+ "," +d);
        in.close();
    }
}
