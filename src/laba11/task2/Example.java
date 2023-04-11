package laba11.task2;
/*Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления.*/
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        System.out.println("Число после перевода");
        toBin(numbers);
    }

    static void toBin(int x) {
        String sr = "";
        if (x != 0) {
            toBin(x / 2);
            sr = sr + x % 2;
        }
        System.out.printf(sr);
    }
}
