package laba7.Example5;

/*Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.*/

public class Example {
    public static void main(String[] args) {
        FirstSupClass SuperClassTest1 = new FirstSupClass("easy to test this");
        SuperClassTest1.PrintToString();

        FirstSubClass SubClassTest1 = new FirstSubClass("Test 4 subclass", 256);
        SubClassTest1.PrintToString();

        SecondSubClass SubClassTest2 = new SecondSubClass("Test 4 subclass again", 'A');
        SubClassTest2.PrintToString();

        FirstSupClass SuperClassTest2 = new FirstSupClass(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        FirstSupClass SuperClassTest3 = new FirstSupClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
