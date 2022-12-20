package Laba4;

public class Example1 {
    //Напишите программу, которая выводить в консольное окно
    //прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
    //строк
    public static void main(String[] args) {
        int sideOfTheRectangle = 11; // Число строк необходимо вывести
        int i;
        int j;
        int z;
        for (i = 1 ; i <= sideOfTheRectangle; i++) {
            System.out.print("Номер строки: " + i + "");
            z = 0;
            for (j = 0; j < 23; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Символов в строке " + z);
        }
    }
}
