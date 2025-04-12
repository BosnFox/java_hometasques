package org.Reynard_de_Bosnie.lab2tasque4.lab2tasque4_3;

public class TVSwitchCommand implements Command {
    boolean currentState = false;
    @Override
    public void execute() {
        System.out.println("Switch TV");
        currentState = !currentState;
        System.out.println("Now " + (currentState ? "on" : "off"));
    }
    @Override
    public boolean getCurrentState() {
        return currentState;
    }
}
