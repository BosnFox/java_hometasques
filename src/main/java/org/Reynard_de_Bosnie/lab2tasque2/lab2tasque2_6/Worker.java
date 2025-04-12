package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6;

import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable {
    private final BlockingQueue<String> workerQueue;
    private int time;

    public Worker(BlockingQueue<String> workerQueue) {
        this.workerQueue = workerQueue;
    }

    @Override
    public void run() {
        while (true) {
            try
            {
                this.time = RandomTimer.getTime();
                Thread.sleep(this.time);
                workerQueue.add("thing " + workerQueue.size());
                System.out.println("WROUGHT thing " + workerQueue.size() + ", time spent: " + this.time + " ms");
            }
            catch (Exception e) {}
        }
    }
}
