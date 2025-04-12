package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_5;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 8,
        taskDescription = "Traffic shared resource")
public class Main implements Solution {
    public void execute() {
        Doroha Doroha = new Doroha();

        Car car = new Car(Doroha);
        Tranfs trans = new Tranfs(Doroha);

        new Thread(car).start();
        new Thread(trans).start();
    }
}
