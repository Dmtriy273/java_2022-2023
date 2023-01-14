package laba7.Example3;
/*Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.*/

public class Example {
    public static void main(String[] args) {
        FirstSupClass superClassTest = new FirstSupClass(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(1024,'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(1024,'K', "кибайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
