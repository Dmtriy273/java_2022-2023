package laba3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Example10 {
    // Напишите программу, в которой создается целочисленный
    //массив, заполняется случайными числами и после этого значения элементов в
    //массиве сортируются в порядке убывания значений.
    public static void main(String[] args) {

        Integer[] array = new Integer[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
            System.out.println("Элемент массива [" + i + "] " + array[i]);
        }
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("\nСортировка массива по убыванию произведена");

        for (int i = 0; i < array.length; i++) {
            System.out.println("\nЭлемент массива [" + i + "] после сортировки " + array[i]);
        }

    }
}
