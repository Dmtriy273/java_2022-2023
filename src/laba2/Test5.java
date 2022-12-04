package laba2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Вести число от 1000 до 10000");
        int x = in.nextInt();

        System.out.println("Количество тысяч в числе: " + (x / 1000) % 10);
        in.close();
    }
}
