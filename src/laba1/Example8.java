package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Day of the week: ");
        String Dayoftheweek = in.nextLine();

        System.out.println("Name of the month: ");
        String Nameofthemonth = in.nextLine();

        System.out.println("Date today: ");
        int datetoday = in.nextInt();

        System.out.println("Day of the week: " + Dayoftheweek);
        System.out.println("Name of the month: " + Nameofthemonth);
        System.out.println("Date today: " + datetoday);
        in.close();

    }
}

