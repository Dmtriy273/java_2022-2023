package Laba5;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = id.nextInt();
        System.out.println("Введите num2");
        int int2 = id.nextInt();
        Example_3 myexample1 = new Example_3();
        Example_3 myexample2 = new Example_3(int1);
        Example_3 myexample3 = new Example_3(int1,int2);
    }
}
class Example_3 {
    private int num1;
    private int num2;

    Example_3() {
        System.out.println("Конструирование Example_3(1)");
    }

    Example_3(int num1) {
        System.out.println("Конструирование Example_3(2)");
        this.num1 = num1;
        System.out.println("num1^num1 = " + exponentOwnPow(num1));
    }

    public int exponentOwnPow(int num1) {
        this.num1 = num1;
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result = num1 * result;
        }
        return result;
    }
    Example_3( int num1, int num2){
        System.out.println("Конструирование Example_3(3)");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1^num2 = " +exponentPow(num1, num2));
    }
    public int exponentPow( int n1, int n2){
        n1 = num1;
        n2 = num2;
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = num1 * result;
        }
        return result;
    }
}
