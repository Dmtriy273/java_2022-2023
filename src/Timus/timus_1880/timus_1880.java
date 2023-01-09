package Timus.timus_1880;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class timus_1880 {

    public static void main(String[] args) throws IOException {

        String inputFileName = "src/Timus/timus_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;


        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int size1 = Integer.parseInt(bufferedReader.readLine());
        String[] str1 = bufferedReader.readLine().split(" ");

        int size2 = Integer.parseInt(bufferedReader.readLine());
        String[] str2 = bufferedReader.readLine().split(" ");

        int size3 = Integer.parseInt(bufferedReader.readLine());
        String[] str3 = bufferedReader.readLine().split(" ");
        int allSize = size1 + size2 + size3;

        String[] strings = new String[allSize];

        for (int i = 0, x = 0, y = 0; i < allSize; i ++) {
            if (i < size1){
                strings[i] = str1[i];
                continue;
            } if(i <(size1 + size2)) {
                strings[i] = str2[x];
                x ++;
                continue;
            }
            strings[i] = str3[y];
            y ++;

        }
        Arrays.sort(strings);

        int count = 0;

        for (int i = 1; i < strings.length -1; i ++) {
            if (strings[i-1].equals(strings[i]) && strings[i].equals(strings[i+1])) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
