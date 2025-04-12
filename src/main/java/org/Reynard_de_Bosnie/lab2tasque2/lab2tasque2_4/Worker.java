package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_4;

public class Worker implements Runnable {
    private final Factory plant;

    public Worker(Factory plant) {
        this.plant = plant;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                plant.produce("smth");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Worker out");
            }
        }
    }
}
