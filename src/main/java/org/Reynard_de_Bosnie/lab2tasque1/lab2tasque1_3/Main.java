package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_3;

import com.sun.jdi.connect.Transport;
import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.Scanner;

@TaskDescription(taskNumber = 3,
        taskDescription = "Class Factory")
public class Main implements Solution {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type?");
        String type = sc.nextLine();
        TransportFactory dispenser = new TransportFactory();
        ITransport car = dispenser.createTransport(type);
        System.out.println(car.getDescription());
    }
}
