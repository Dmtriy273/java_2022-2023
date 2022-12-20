package Laba4;

import java.util.Scanner;

public class Example7 {
    //Напишите программу, в которой создается двумерный числовой массив
    //и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
    //затем последний столбец (снизу вверх), вторая строка (слева направо) и так
    //далее.
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите колличество строк: ");
        int a = id.nextInt();
        System.out.print("Введите колличество столбцов: ");
        int b = id.nextInt();
        int Zmeyka[][] = new int[a][b];
        int h = 0;
        int t = 0;
        int c = 0;
        for (int i = 0; c<Zmeyka.length; c++){
            for (int j = 0 ; j < (Zmeyka[i].length - h); j++){
                Zmeyka[i][j]=t;t++;}
            i++;
            for(int k = i; k < Zmeyka.length; k++){
                Zmeyka[k][Zmeyka[i].length-1-h] = t; t++;}
            h++;}

        int z = 0;
        for (int i=0; i<Zmeyka.length; i++){
            int count = i+1;
            System.out.print("Номер строки" +count+ ":");
            for (int j = 0; j<Zmeyka[i].length; j++){
                System.out.print(Zmeyka[i][j]+" ");
                z++;}
            System.out.println("Колличество символов в строке" +z);
            z=0;
        }
    }
}
