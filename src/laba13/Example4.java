package laba13;

/*Напишите программу, которая создает 10 потоков и каждый
поток выводит на экран свой номер.*/

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }

    static class MyThread extends Thread {
        int number;

        public MyThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Поток " + number + " выполняется");
        }
    }
}
