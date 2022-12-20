package Laba4;

import java.util.Scanner;

public class Example4 {
    //Напишите программу, в которой создается двумерный массив, который
    //выводит прямоугольный треугольник;
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt();
        char [][] graph = new char[height][];
        for (int i = 0; i < graph.length; i++) {
            int j = i+1;
                graph[i]=new char[j];
            }
        int z=0;
        for (int i=0; i < height; i++){
            for (int j=0; j < i+1; j++) {
                graph[i][j] = '2';
            }
        }
        for (int i = 0; i < height; i++) {
            int count = i + 1;
            System.out.print("Номер строки " + count + " : ");
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
                z++;
            }
            System.out.println("оличество символов в строке " + z);
            z = 0;
        }
    }
}

