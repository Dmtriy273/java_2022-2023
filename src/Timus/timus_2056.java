package Timus;

import java.util.Scanner;

public class timus_2056 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String result = "";

        int count = in.nextInt();
        int mcount = count;
        int sum = 0;

        while (mcount > 0) {
            int mark = in.nextInt();
            if (mark == 3) {
                result = "None";
            }
            sum += mark;
            mcount--;
        }
        in.close();

        if (result.equals("") == true) {
            double avg = (double) sum / (double) count;
            if (avg == 5.0)
                result = "Named";
            else if (avg >= 4.5)
                result = "High";
            else
                result = "Common";
        }

        System.out.println(result);
    }
}
