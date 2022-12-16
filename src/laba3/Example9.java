package laba3;

import java.util.Arrays;
import java.util.Random;

public class Example9 {
    //Напишите программу, в которой создается массив и заполняется
    //случайными числами. Массив отображается в консольном окне. В этом
    //массиве необходимо определить элемент с минимальным значением. В
    //частности, программа должна вывести значение элемента с минимальным
    //значением и индекс этого элемента. Если элементов с минимальным
    //значением несколько, должны быть выведены индексы всех этих элементов
    public static void main(String[] args) {

        int a = 6;
        int[] ints = new int[a];
        Random random = new Random();

        System.out.println("До сортировки: ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(500);
            System.out.println("[" + i + "]" + ints[i]);
        }
        Arrays.sort(ints);
        int x = Math.min(ints[0], ints[a - 1]);
        System.out.println("После сортировки: ");

        for (int i = 0; i < ints.length; i++) {
            System.out.println("[" + i + "]" + ints[i]);

        }
        System.out.println("Минимальное значение и индекс этого элемента или элементов, если их несколько.");
        for (int i = 0; i < ints.length; i++) {
            if (x == ints[i]) {
                System.out.println("[" + i + "]" + x);
            }


        }
    }
}
