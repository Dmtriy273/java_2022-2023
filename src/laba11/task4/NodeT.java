package laba11.task4;

import laba11.task4.Node;

public class NodeT { // главный класс
        public static void main(String[] args) {
            // создание несвязанных узлов с помошью конструктора
            laba11.task4.Node node0 = new laba11.task4.Node(0, null); // 0-узел - будет головой в списке
            laba11.task4.Node node1 = new laba11.task4.Node(1, null);
            laba11.task4.Node node2 = new laba11.task4.Node( 2, null);
            laba11.task4.Node node3 = new laba11.task4.Node(3, null); // последний узел - будет хвостом в списке

            //связывание узлов в список с помошью ссылок

            node0.next = node1;
            node1.next = node2;
            node2.next = node3;
            // вывод списка с использованием вспомогательной переменной реф
            // соответсвующей текущему значению ссылки при проходе списка

            Node ref = node0;

            while (ref != null) {
                System.out.println("" + ref.value);
                ref = ref.next;
            }
        }
    }
