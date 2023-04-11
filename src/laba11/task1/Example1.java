package laba11.task1;

/*Для заданного параметра x вывести последовательность значений элементов числового
ряда в соответствии со следующими требованиями:
очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого); 0 ≤ x < 20.*/

public class Example1 {
        public static void m(int x) {
            System.out.println("x = " + x);
            if ((2 * x + 1) < 20) {
                m(2 * x + 1);
            }
        }

        public static void main(String[] args) {
            m(1);
        }
}
