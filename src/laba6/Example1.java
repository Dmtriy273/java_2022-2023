package laba6;
/*  Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю.*/

class Example {
    private char ch;
    private String str;

    public void SetField(char c){
        ch = c;
        System.out.print("\n Вызов метода SetField с аргументом char. ch="+ch);
    }
    public void SetField(String s){
        str = s;
        System.out.print("\n Вызов метода SetField с аргументом string. str="+str);
    }
    public void SetField(char [] CharArray) {
        if (CharArray.length == 1) {
            ch = CharArray[0];
            System.out.print("\n Вызов метода SetField с массивом char. ch=" + ch);
        } else {
            str = new String(CharArray);
            System.out.print("\n Вызов метода SetField с массивом string. str=" + str);
        }
    }
}
public class Example1 {
    public static void main(String[] args){
        Example myex = new Example();
        myex.SetField('A');
        myex.SetField("B");
        char[] CharArray1 = {'п','р','и','в','е','т'};
        char[] CharArray2 = {'C'};
        myex.SetField(CharArray1);
        myex.SetField(CharArray2);
    }
}
