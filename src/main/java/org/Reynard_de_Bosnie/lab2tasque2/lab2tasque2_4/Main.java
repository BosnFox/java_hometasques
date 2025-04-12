package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_4;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 7,
        taskDescription = "Factory shared resource")
public class Main implements Solution {
    public void execute() throws InterruptedException {
        Factory factory = new Factory();

        Worker worker = new Worker(factory);
        Acquirer acquirer = new Acquirer(factory);

        Thread t2 = new Thread(acquirer);
        t2.start();
        Thread t1 = new Thread(worker);
        t1.start();
        Thread.sleep(5000);
        t1.interrupt();
        t2.interrupt();
    }
}