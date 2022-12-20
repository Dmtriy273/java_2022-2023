package Laba4;

import java.util.Scanner;

public class Example3 {
    // Напишите программу, в которой создается двумерный массив, который
    //выводи прямоугольник из цифр 2
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = id.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt();
        int[][] graph = new int[height][width];
        int z = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            int count = i + 1;
            System.out.print("Номер строки " + count + " : ");
            for (int j = 0; j < width; j++) {
                System.out.print(graph[i][j] + " ");
                z++;
            }
            System.out.println("оличество символов в строке " + z);
            z = 0;
        }
    }
}