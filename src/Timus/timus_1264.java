package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus_1264 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int M = in.nextInt();
        int result = N*(M+1);

        out.println(result);
        out.flush();
    }
}
