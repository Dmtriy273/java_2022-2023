package laba6;
/*Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу */

public class Example2 {
    public static class Example{
        private static int val1;
        public static void view(){
            System.out.println(val1);
            val1++;
        }
    }
    public static void main(String[] args){
        Example myex = new Example();
        myex.view();
        myex.view();
        myex.view();
        myex.view();
    }
}
