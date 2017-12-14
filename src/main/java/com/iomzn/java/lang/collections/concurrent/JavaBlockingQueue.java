package com.iomzn.java.lang.collections.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JavaBlockingQueue {
    private static final Integer EXIT = -1;

    static class Producer implements Runnable {
        private BlockingQueue<Integer> blockingQueue;

        Producer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 1000; i++) {
                    blockingQueue.put(i);
                    System.out.println("produce " + i);
                    Thread.sleep(100);
                }
                blockingQueue.put(EXIT);
                System.out.println("produce " + EXIT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private BlockingQueue<Integer> blockingQueue;


        Consumer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            try {
                Integer value;
                while (!(value = blockingQueue.take()).equals(EXIT)) {
                    System.out.println("\tconsume " + value);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(100);
        new Thread(new Producer(blockingQueue)).start();
        new Thread(new Consumer(blockingQueue)).start();
    }
}
