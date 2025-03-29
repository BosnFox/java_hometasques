package lab2tasque4.lab2tasque4_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
