package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input FirstName: ");
        String FirstName = in.nextLine();

        System.out.println("Input surname: ");
        String Name = in.nextLine();

        System.out.println("Input patronymic: ");
        String Patronymic = in.nextLine();

        System.out.println("Hallo:"+FirstName+Name+Patronymic);
        in.close();

    }
}
