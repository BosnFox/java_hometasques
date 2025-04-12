package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_2;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 2, taskDescription = "Coffee Interfaces")
public class Main implements Solution {
    public static void main(String[] args) {
        ICoffee coffee = new Espresso();
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());

        coffee = new Milk(coffee);
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());

        coffee = new Caramel(coffee);
        System.out.println("Price: " + coffee.getPrice() + " F; Description: " + coffee.getDescription());
    }
    @Override
    public void execute() {
        main(new String[]{});
    }
}
