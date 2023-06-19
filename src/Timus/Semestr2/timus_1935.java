package Timus.Semestr2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class timus_1935 {

    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));


        String str = bufferedReader.readLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        List<Integer> list = new ArrayList<>();

        while (matcher.find()) {

            list.add(Integer.parseInt(matcher.group()));
        }

        int answer = 0;

        for (int i: list) {
            answer +=i;
        }
        Collections.sort(list);

        answer += list.get(list.size()-1);

        System.out.println(answer);

    }
}
