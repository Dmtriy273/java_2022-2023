package laba11.task4;
/* Отработать код с помощью отладчика и привести скриншоты
минимум трех точек, обработанных отладчиком.
 */

//класс - структура элемента списка
public class Node {

        public int value; // значение

        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next) { // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
