package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_3;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 6,
        taskDescription = "Car-train shared resource")
public class Main implements Solution {
    @Override
    public void execute() {
        Rails rails = new Rails();
        for (int i = 0; i < 10; i++) {
            int curr = i;
            Car car = new Car("nyaga " + curr, rails);
            new Thread(car).start();
        }
        new Train(rails).start();
    }
}