package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfTasks = in.nextInt();

        int differenc = 12 - numberOfTasks;

        int time = differenc * 45;

        if (time <= 240){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        out.flush();
    }

}
