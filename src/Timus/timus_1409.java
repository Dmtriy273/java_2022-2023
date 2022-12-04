package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

    public class timus_1409 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int a = in.nextInt();
            int b = in.nextInt();

            int c = a + b - 1;

            int harry = c - a;
            int larry = c - b;


            System.out.println(harry + " " + larry);
            in.close();
        }
    }

