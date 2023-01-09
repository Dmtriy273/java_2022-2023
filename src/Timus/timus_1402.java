package Timus;

import java.util.Scanner;

public class timus_1402 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int result = 1;

        if (a == 1 || a > 21) {
            System.out.println(0);

        } else if (a == 2) {
            System.out.println(2);

        } else {
            for (int i = 1; i <= a; i ++) {
                result *= i;
            }
            System.out.println(result * 2);
        }


    }

}
