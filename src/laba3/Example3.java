package laba3;

import java.util.Scanner;
//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла
public class Example3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.println("Введите количество чисел в последовательности:");
    n = in.nextInt();
    int a = 1, b = 1;
    System.out.println("Число Фибонначи используя операцию цикла while");
    System.out.print(a + ", " + b);
    int c, i = 2;
    while (i < n) {
        c = a + b;
        a = b;
        b = c;
        System.out.print(", " + c);
        i++;
    }
    System.out.println("\nЧисло Фибонначи используя операцию цикла for");
    a = 1;
    b = 1;
    System.out.print(a + ", " + b);
    for (i = 0; i < n - 2; i ++) {
        c = a + b;
        a = b;
        b = c;
        System.out.print(", " + c);

    }
}
}
