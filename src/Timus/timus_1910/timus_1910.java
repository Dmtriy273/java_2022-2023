package Timus.timus_1910;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class timus_1910 {

    public static void main(String[] args) throws IOException {


        String inputFileName = "src/Timus/timus_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;


        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] str1 = bufferedReader.readLine().split(" ");

        int[] intsAfter = new int[size-2];

        for (int i = 0; i < intsAfter.length; i++) {
            intsAfter[i] = Integer.parseInt(str1[i]) +
                    Integer.parseInt(str1[i + 1]) +
                    Integer.parseInt(str1[i + 2]);
        }

        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);

        int firstValue = intsAfter[intsAfter.length - 1];

        for (int i = 0; i < intsAfter.length; i ++) {
            if (ints[i] == firstValue) {
                System.out.println(firstValue + " " + (i + 2));
                break;
            }
        }
    }
}
