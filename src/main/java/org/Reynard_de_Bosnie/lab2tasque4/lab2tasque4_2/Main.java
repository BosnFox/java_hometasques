package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_2;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

@TaskDescription(taskNumber = 12,
        taskDescription = "Memento pattern")
public class Main implements Solution {
    @Override
    public void execute() {
        Caretaker caretaker1 = new Caretaker();
        TextEditor userEditor1 = new TextEditor(caretaker1);
        userEditor1.setText("Hello World");
        System.out.println(userEditor1.getText());
        userEditor1.setText("Hello Again World");
        System.out.println(userEditor1.getText());
        userEditor1.reset();
        System.out.println(userEditor1.getText());
        userEditor1.reset();
        System.out.println(userEditor1.getText());
    }
}
