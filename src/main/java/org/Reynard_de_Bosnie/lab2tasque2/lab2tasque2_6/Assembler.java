package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6;

import java.util.concurrent.ArrayBlockingQueue;

public class Assembler implements Runnable {
    private final ArrayBlockingQueue<String> workerQueue;
    private final ArrayBlockingQueue<String> assemblerQueue;
    String passable;
    int time;
    public Assembler(ArrayBlockingQueue<String> workerQueue, ArrayBlockingQueue<String> assemblerQueue) {
        this.workerQueue = workerQueue;
        this.assemblerQueue = assemblerQueue;
    }
    @Override
    public void run() {
        while (true) {
            try
            {
                if (assemblerQueue.size() < 10 && !workerQueue.isEmpty()) {
                    time = RandomTimer.getTime();
                    Thread.sleep(time);
                    passable = workerQueue.take();
                    assemblerQueue.put(passable);
                    System.out.println("ASSEMBLED " + passable + ", time spent: " + time + " ms");
                }
            }
            catch (Exception e) {}
        }
    }
}
