package laba11.task5;
//Добавление элемента в начало списка (с головы).
public class NodeT3 {
        public static void main(String[] args) {

            Node head = null;

            for(int i = 9 ; i >= 0 ; i--) {
                head = new Node(i, head);
            }
            head = new Node(404, head);
            // вывод элементов на экран
            Node ref = head;
            while (ref != null) {
                System.out.println(" " + ref.value);
                ref = ref.next;
            }
        }
}
