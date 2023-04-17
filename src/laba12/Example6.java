package laba12;

/*Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые делятся на заданное число без остатка.*/
import java.util.ArrayList;
import java.util.List;

public class Example6 {
        public static void main(String[] args) {
            Integer [] arr = divider(60);
            for (Integer integer : arr) {
                System.out.println(integer);
            }
        }
        static Integer [] divider(int n) {
            List<Integer> resultList = new ArrayList<Integer>();
            Integer [] result;
            for (int i = 1; i <= n/2; i++) {
                if (n%i == 0)
                    resultList.add(i);
            }
            resultList.add(n);
            result = resultList.toArray(new Integer[resultList.size()]);

            return result;
        }
}

