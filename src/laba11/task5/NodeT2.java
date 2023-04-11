package laba11.task5;

public class NodeT2 {
    // добавление элементов с перемещением головы (наращивание с головы)
    public static void main(String[] args) {
            Node head = null; // начальное значение ссылки на голову

            for(int i = 9 ; i >= 0 ; i--) {
                head = new Node(i, head);
            }

            // вывод элементов на экран
            Node ref = head;
            while (ref != null) {
                System.out.println(" " + ref.value);
                ref = ref.next;
            }
        }
    }
