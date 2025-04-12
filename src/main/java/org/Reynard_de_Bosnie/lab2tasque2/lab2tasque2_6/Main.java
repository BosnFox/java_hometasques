package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@TaskDescription(taskNumber = 9,
        taskDescription = "3-step Factory")
public class Main implements Solution {
    @Override
    public void execute() {
        ArrayBlockingQueue<String> workerQueue = new ArrayBlockingQueue<String>(5);
        ArrayBlockingQueue<String> assemblerQueue = new ArrayBlockingQueue<String>(5);
        ArrayBlockingQueue<String> managerQueue = new ArrayBlockingQueue<String>(5);

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(new Worker(workerQueue));
        executor.submit(new Assembler(workerQueue, assemblerQueue));
        executor.submit(new Manager(assemblerQueue, managerQueue));

        executor.shutdown();
    }
}
