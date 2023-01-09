package Timus;

import java.util.Scanner;

public class timus_1209 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        for (long i = 0; i < n; i++) {
            long k = in.nextLong() - 1;

            double x = (Math.sqrt(1 + 8 * k) - 1) / 2;
            if (Math.abs(x - Math.floor(x)) < 10e-7) {
                System.out.print("1 ");
            } else
                System.out.print("0 ");
        }
        in.close();

    }

}
