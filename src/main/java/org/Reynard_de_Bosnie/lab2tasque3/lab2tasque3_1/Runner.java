package org.Reynard_de_Bosnie.lab2tasque3.lab2tasque3_1;

import org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6.RandomTimer;

import java.util.concurrent.*;

class Runner implements Runnable {
    private int id;
    private CyclicBarrier startBarrier;

    public Runner(int id, CyclicBarrier startBarrier) {
        this.id = id;
        this.startBarrier = startBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Runner " + id + " ready");
            startBarrier.await();
            System.out.println("Runner " + id + " sprints");
            Thread.sleep(RandomTimer.getTime());
            System.out.println("Runner " + id + " crosses finish");
        } catch (Exception e) { }
    }
}