package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_3;

import java.util.Random;

public class Rails {

    private static boolean isTrain = false;

    public synchronized void trainIncoming() throws InterruptedException {
        System.out.println("train!!!!!!");
        isTrain = !isTrain;
        //Thread.sleep(5000);
        if (!isTrain)
        {
        notifyAll();
        }
    }

    public synchronized void carIncoming(String car) throws InterruptedException {
        System.out.println(car + " incomes");
        Thread.sleep(100);
        while (isTrain) {
            System.out.println(car + " awaits");
            wait();
        }
        System.out.println(car + " crosses");
        Thread.sleep(100);
        System.out.println(car + " off");
    }
}
// new int[] {1000, 5000, 500}[new Random().nextInt(2)]


