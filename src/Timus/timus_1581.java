package Timus;

import java.util.Scanner;

public class timus_1581 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n];


        for (int i = 0; i < ints.length; i++) {
            ints[i] = in.nextInt();
        }

        int number = ints[0], count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != number) {
                number = ints[i];
                System.out.print(count + " " + ints[i - 1] + " ");
                count = 1;
            } else count ++;
        }
        System.out.print(count + " " + ints[ints.length - 1] + " ");
    }
}
