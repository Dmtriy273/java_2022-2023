package laba13;

/* Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.*/

import java.util.concurrent.*;

public class Example5 {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 18, 21, 73, 4, 9};
        int numThreads = 8;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int[] highestValues = new int[numThreads];

        int partitionSize = numbers.length / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int[] partition = new int[partitionSize];
            System.arraycopy(numbers, i * partitionSize, partition, 0, partitionSize);
            executor.execute(new MaxElementFinderThread(i, partition, highestValues));
        }
        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numThreads; i++) {
            if (highestValues[i] > max) {
                max = highestValues[i];
            }
        }
        System.out.println("Наибольший элемент: " + max);
    }
}

class MaxElementFinderThread implements Runnable {
    private int threadIndex;
    private int[] numbers;
    private int[] highestValues;

    public MaxElementFinderThread(int threadIndex, int[] numbers, int[] highestValues) {
        this.threadIndex = threadIndex;
        this.numbers = numbers;
        this.highestValues = highestValues;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        highestValues[threadIndex] = max;
    }

}
