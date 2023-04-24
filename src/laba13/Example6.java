package laba13;

/* Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.*/

import java.util.Arrays;

public class Example6 {

    public static void main(String[] args) {

        int[] array = {1, 2, 7, 4, 15, 6, 7, 8};

        int threadsCount = 8;

        int chunkSize = (int) Math.ceil(array.length / (double) threadsCount);

        Thread[] threads = new Thread[threadsCount];

        int startIndex, endIndex;

        for (int i = 0; i < threadsCount; i++) {

            startIndex = i * chunkSize;

            endIndex = Math.min(startIndex + chunkSize, array.length);

            threads[i] = new SummationTask(i, Arrays.copyOfRange(array, startIndex, endIndex));

            threads[i].start();

        }

        long totalSum = 0;

        for (int i = 0; i < threadsCount; i++) {

            try {

                threads[i].join();

                totalSum += ((SummationTask) threads[i]).getPartialSum();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

        System.out.println("Сумма всех элементов: " + totalSum);

    }

    private static class SummationTask extends Thread {

        private int[] array;

        private long partialSum;

        public SummationTask(int threadIndex, int[] array) {

            super("Поток " + threadIndex);

            this.array = array;

        }
        public long getPartialSum() {

            return partialSum;
        }
        @Override

        public void run() {

            for (int i : array) {

                partialSum += i;

            }

        }

    }
}
