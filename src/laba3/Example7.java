package laba3;

public class Example7 {
//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.
    public static void main(String[] args) {
        int n = 10;
        char[] chars = new char[n];
        char b = 'a';

        System.out.println("Массив символов в консольном окне: ");

        for (int i = 0; i < chars.length; i++) {
            chars[i] = b;
            b+=2;
            System.out.print(chars[i] + ", ");
        }

        System.out.println("\nМассив символов в консольном окне, в обратном порядке: ");
        for (int i = chars.length - 1 ; i >= 0; i--) {
            System.out.print(chars[i] + ", ");
        }
    }
}
