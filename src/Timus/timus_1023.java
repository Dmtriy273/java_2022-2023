package Timus;

import java.util.Scanner;

public class timus_1023 {

    public static void main(String[] args) {

        int i = 3;
        int a;


        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        while (a % i != 0) {
            i++;
        }

        System.out.println(i - 1);
    }
}
