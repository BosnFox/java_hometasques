package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_1;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.Scanner;

@TaskDescription(taskNumber = 1,
        taskDescription = "Approver Factory")
public class Main implements Solution {
    @Override
    public void execute() {
        ApproverFactory Dispenser = new ApproverFactory();
        Approver junior = Dispenser.getApprover("J");
        Approver senior = Dispenser.getApprover("S");
        Approver director = Dispenser.getApprover("M");

        junior.setNextApprover(senior);
        senior.setNextApprover(director);

        Scanner console = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("Enter your error code (-1 to exit, 0 & 1 minor, 2 medium, 3 complex): ");
            Integer error = console.nextInt();
            if (error.equals(-1)) {done = true;}
            else {junior.processRequest(error);}
        }
    }
}