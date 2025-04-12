package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_1;


import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6.RandomTimer;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.ArrayList;
import java.util.List;
@TaskDescription(taskNumber = 14,
        taskDescription = "Visitor pattern")
public class Main implements Solution {
    @Override
    public void execute() {
        String temp;
        List<FileSystemElement> files = new ArrayList<FileSystemElement>();
        for (int i = 0; i < 10; i++) {
            temp = "File " + i;
            files.add(new File(temp, RandomTimer.getTime()));
        }
        Folder folder = new Folder("Folder" + files.size(), files);
        SizeAnalysis.visit(folder);
        VirusScaner.visit(folder);
    }
}
