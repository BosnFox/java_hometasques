package org.Reynard_de_Bosnie.lab2tasque3.lab2tasque3_1;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@TaskDescription(taskNumber = 10,
        taskDescription = "CyclicBarriers")
public class Main implements Solution {

    public static void main(String[] args) {

    }

    @Override
    public void execute() {
        CyclicBarrier startLine = new CyclicBarrier(5, () -> System.out.println("RACE BEGINS!!!"));

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Runner(i, startLine));
        }
        executorService.shutdown();
    }
}
