package com.iomzn.java.lang.collections.concurrent;

import java.util.concurrent.CountDownLatch;

public class JavaCountDownLatch {
    private static int count = 10;

    static class Waiter implements Runnable {
        private CountDownLatch countDownLatch;

        Waiter(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("waiter released");
        }
    }

    static class Decrementer implements Runnable {
        private CountDownLatch countDownLatch;

        Decrementer(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= count; i++) {
                    countDownLatch.countDown();
                    System.out.println("count " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(count);
        new Thread(new Waiter(countDownLatch)).start();
        new Thread(new Decrementer(countDownLatch)).start();
    }
}
