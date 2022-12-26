package Laba5;
/*  Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код. */
public class Example1 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.viewCode();

        Example1.Set('A');
        System.out.println("Char code = " + Example1.getCodeSymbol());

        Example1.viewCode();
    }
}

    class Example {
    private char ch;

    public void Set(char ch1) {
        ch = ch1;
    }

    public int getCodeSymbol(){
        return  ch;
    }

    public void viewCode() {
        System.out.println("Ch1 = " +ch);
        int code = ch;
        System.out.println("ch1 = " + code);
    }
}
