package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_2;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 5,
        taskDescription = "Restaurant Factory")
public class Main implements Solution {
    @Override
    public void execute() {
        System.out.println(Thread.currentThread().getName() + " main");

        Restaurant rest = new Restaurant();
        Cook cook = new Cook(rest);
        Servant servant = new Servant(rest);

        new Thread(cook).start();
        new Thread(servant).start();
    }
}
