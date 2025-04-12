package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_3;

import org.Reynard_de_Bosnie.TaskDescription;
import org.Reynard_de_Bosnie.utils.Solution;

import java.util.ArrayList;
import java.util.List;
@TaskDescription(taskNumber = 13,
        taskDescription = "Command pattern")
public class Main implements Solution {
    @Override
    public void execute() {
        LightSwitchCommand light1 = new LightSwitchCommand();
        LightSwitchCommand light2 = new LightSwitchCommand();
        TVSwitchCommand tv1 = new TVSwitchCommand();
        RemoteControl remoteControl = new RemoteControl(new ArrayList<Command>());
        remoteControl.addCommand(light1);
        remoteControl.addCommand(light2);
        remoteControl.addCommand(tv1);

        remoteControl.execute(0);
        remoteControl.execute(2);
        remoteControl.execute(1);
        remoteControl.execute(1);
        remoteControl.totalShutdown();
    }
}
