package laba9.folder1;

public class exemple_13 {
    public static void main(String[] args) { //аргумент main args - значение не присвоено
    try {
        int l = args.length; //1. int l присваивается значение аргумента main args = 0
        System.out.println("размер массива= " + l); //2. печатает "размер массива = 0"
        int h=10/l; //3.при расчете h - деление на 0
        args[l + 1] = "10"; //эта строка пропушена из-за ошибки
    }
    catch (ArithmeticException e) {//4. исключение перехвачено и обработано, печатает "деление на ноль"
        System.out.println("Деление на ноль"); }
    catch (ArrayIndexOutOfBoundsException e) { // эта часть кода пропущена
        System.out.println("Индекс не существует"); }
    }
}
