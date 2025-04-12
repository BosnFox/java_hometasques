package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_1;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 4,
        taskDescription = "Class Factory")
public class Main implements Solution {
    @Override
    public void execute() {
        GasStation statjon = new GasStation(2);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> statjon.gasRefill(String.format("Car %s", finalI))).start();
        }
    }
}
