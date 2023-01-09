package Timus;

import java.util.Scanner;

public class timus_1787 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int auto = 0;

        for (int i = 0; i < n; i ++){
            int x = in.nextInt();
            auto = auto + x - k;
            if (auto < 0){
                auto = 0;
            }
        }
        System.out.println(auto);

    }
}
