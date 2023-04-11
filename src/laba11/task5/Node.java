package laba11.task5;

/*Выполнить пример 1 из раздела 2.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек,
обработанных отладчиком.*/

public class Node { //класс - структура элемента списка
        public int value; // значение

        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next) { // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
