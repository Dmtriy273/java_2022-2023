package laba11.task1;

/*Вывести число Фибоначчи, заданное его номером в последовательности.
Последовательность Фибоначчи формируется так: нулевой член последовательности равен нулю,
первый – единице, а каждый следующий – сумме двух предыдущих.
 */
public class Example5 {
        private static int step = 0;

        public static void main(String[] args) {
            System.out.println(fact(5));
        }

        public static int fact(int n) {
            System.out.println("" + n + "-> " + step);
            step++;
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fact(n - 1) + fact(n - 2);

            }
        }
    }
