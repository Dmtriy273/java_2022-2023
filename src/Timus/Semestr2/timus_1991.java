package Timus.Semestr2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timus_1991 {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        String[] droidNK = bufferedReader.readLine().split(" ");

        int droidK = Integer.parseInt(droidNK[1]);
        int droidAll = 0;
        int ostatokBumbum = 0;

        String[] bumbum = bufferedReader.readLine().split(" ");


        for (int i = 0; i < bumbum.length; i++) {

            if (droidK < Integer.parseInt(bumbum[i])) {

                ostatokBumbum += Integer.parseInt(bumbum[i]) - droidK;
            }

            if (droidK > Integer.parseInt(bumbum[i])) {

                droidAll += Integer.parseInt(bumbum[i]) - droidK;
            }
        }

        System.out.println(ostatokBumbum + " " + Math.abs(droidAll));
    }
}

