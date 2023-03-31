package laba9.folder1;

public class exemple_14 {
    public static void m(int x) throws ArithmeticException{ //из-за расширения метода исключение будет перехвачено
        int h=10/x; //4.при расчете h - деление на 0
    }
    public static void main(String[] args) { //аргумент main args - значение не присвоено
        try {
            int l = args.length; //1. int l присваивается значение аргумента main args = 0
            System.out.println("размер массива= " + l); //2. печатает "размер массива = 0"
            m(l); //3. в метод передан аргумент l = "0"
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль"); //5. исключение перехвачено и обработано, печатает "Ошибка: деление на ноль"
        }
    }
}
