package laba9.folder2.task1;

/*
В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– несоответствие числового типа данных;
– положительные элементы отсутствуют.
*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            PositiveAverageArray(SetArray());
        } catch (NullPointerException e) {
            System.out.println("отсутсвуют элементы массива необходимые для расчета (" + e + ")");
        } catch (Exception e) {
            System.out.println("неверный ввод данных (" + e + ")");
        }

    }

    private static int[] SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите размер массива");
        int a = scan.nextInt();
        int[] Array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("введите целочисленный элемент массива " + "[" + (i + 1) + "]");
            Array[i] = scan.nextInt();
        }
        return Array;
    }

    private static void PositiveAverageArray(int[] InputArray) {
        double A = 0;
        boolean flag = false;
        for (int j : InputArray) {
            if (j > 0) {
                A += j;
            } else if (j == 0) {
                flag = true;
            }
        }
        if (A <= 0 && !flag) {
            throw new NullPointerException("отсутсвуют положительные элементы массива");
        }
        System.out.println("среднее значение среди положительных элементов одномерного массива = [" + (A / InputArray.length) + "]");
    }
}