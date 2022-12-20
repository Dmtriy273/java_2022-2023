package Laba4;

public class Example2 {
    // Напишите программу, которая выводит в консольное окно
    //прямоугольный треугольник
    public static void main(String[] args) {
        int triangle = 15;
        int i;
        int j;
        int z = 0;
        for (i = 1; i <= triangle; i++) {
            System.out.print("Номер строки: " + i + "");
            for (j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Символов в строке " + z);
        }
    }
}
