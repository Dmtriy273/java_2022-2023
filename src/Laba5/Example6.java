package Laba5;

public class Example6 {
    public static void main(String[] args){
        Example_6 myexample = new Example_6(2,5);
        myexample.PrintInt();
        myexample = new Example_6(1);
        myexample.PrintInt();
        myexample.SetInt(3,15);
        myexample.PrintInt();
        myexample.SetInt(-9);
        myexample.PrintInt();
    }
}
class Example_6{
    private int min;
    private int max;
    public void SetInt(int num1, int num2){
        System.out.println("Метод Set() c 2-мя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    public void SetInt(int num){
        System.out.println("Метод Setint() c 1-им аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    void PrintInt(){
        System.out.println("min = " +min);
        System.out.println("max = " +max);
    }
    Example_6(int num1, int num2){
        System.out.println("Конструктор Example_6 c 2-мя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    Example_6(int num){
        System.out.println("Конструктор Example_6 c 1-им аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
}
