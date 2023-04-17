package laba12;

/*Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые больше заданного значения.*/


public class Example8 {

        public static void main(String args[]) {
            int value = 65;
            int[] myArray = {41, 52, 63, 74, 85, 96 };
            System.out.println("Элементы массива, которые больше заданного значения, являются::");
            for(int i = 0; i<myArray.length; i++) {
                if(value<=myArray[i]) {
                    System.out.println("Индекс ::"+i+" Элемент::"+myArray[i]);
                }
            }
        }
}

