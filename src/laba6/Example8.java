package laba6;
/*Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве)*/

import java.util.Random;

public class Example8 {
    public static void main(String[] args){
        Random random = new Random(1000);
        int ArrayLength = 11;
        int intArray[] = new int[ArrayLength];
        for (int i = 0; i<ArrayLength; i++){
            intArray[i] = random.nextInt(1000);
            System.out.println("intArray["+i+"]="+intArray[i]);
        }
        System.out.println("Среднее значение intArray[" +ArrayLength+"]  = "+Example_8.ArrayAvg(intArray));
    }
    protected static class Example_8{
        private static double ArrayAvg (int Array[]){
            int sum=0;
            for (int i = 0; i<Array.length; i++){
                sum += Array[i];
            }
            double result = (double)sum/Array.length;
            return result;
        }
    }
}
