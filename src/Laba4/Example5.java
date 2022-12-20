package Laba4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    //Напишите программу, в которой создается двумерный целочисленный
    //массив. Он заполняется случайными числами. Затем в этом массиве строи и
    //столбцы меняются местами: первая строка становится первым столбцом,
    //вторая строка становиться вторым столбцом и так далее. Например, если
    //исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
    //из 5 строк и 3 столбцов
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("Введите колличество столбцов: ");
        int a = id.nextInt();
        System.out.print("Введите колличество строк: ");
        int b = id.nextInt();
        int firstArray[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.print("i =" + i + "; j=" + j + "; value=" + firstArray[i][j]);
            }
        }
        System.out.println("---------------------------");

        int secondArray[][] = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.print("i =" + i + "; j=" + j + "; value=" + secondArray[i][j]);
            }
        }
    }
}
