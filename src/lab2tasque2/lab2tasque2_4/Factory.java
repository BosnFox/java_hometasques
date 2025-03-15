package lab2tasque2.lab2tasque2_4;

import java.util.Random;

public class Factory {
    volatile int currentEncumbering = 0;
    final int CAPACITY = 5;
    Random rand = new Random();
    int produceTime, consumeTime;
    Integer[] possibleTime = {100, 1000, 2000};

    public synchronized void produce(String item) throws InterruptedException {
        while (currentEncumbering >= CAPACITY) {
            System.out.println("O'er-loaded for now...");
            wait();
        }
        System.out.println("Producing " + item);
        currentEncumbering++;
        System.out.println("Produced " + item + ", time spent " + 1);
        notifyAll();
    }

    public synchronized void consume(String item) throws InterruptedException {
        while (currentEncumbering <= 0) {
            System.out.println("nuthin' 2 take");
            wait();
        }
        System.out.println("Reaching for " + item);
        consumeTime = possibleTime[rand.nextInt(possibleTime.length)];
        //Thread.sleep(consumeTime);
        currentEncumbering--;
        System.out.println("Gotten " + item + ", time spent " + consumeTime);
        Thread.sleep(1000);
        notifyAll();
    }
}
