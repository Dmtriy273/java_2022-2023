package Timus.Semestr2;

import java.util.Arrays;
import java.util.Scanner;

public class timus_1026 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long[] longs = new long[(int) n];
        String a;
        for (int k = 0; k < longs.length; k++) {
            longs[k] = in.nextLong();

        }
        a = in.next();

        Arrays.sort(longs);

        int u = in.nextInt();
        int c;
        for (int i = 0; i < u; i++) {
            c = in.nextInt();
            System.out.println(c);

            System.out.println(longs[c - 1]);

        }

    }
}
