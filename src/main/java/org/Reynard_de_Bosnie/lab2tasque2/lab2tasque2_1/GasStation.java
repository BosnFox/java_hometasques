package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_1;

import java.util.concurrent.Semaphore;

public class GasStation {
    private final Semaphore sema;

    public GasStation(int counter) {
        this.sema = new Semaphore(counter);
    }

    public void gasRefill(String car) {
        try {
            System.out.println("Refilling " + car + " request");
            sema.acquire();
            System.out.printf("Refilling %s ...\n", car);
            Thread.sleep(2000);
            System.out.println(car + " refilled");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            sema.release();
        }
    }
}
