package lab2tasque4.lab2tasque4_3;

public class LightSwitchCommand implements Command {
    boolean currentState = false;
    @Override
    public void execute() {
        System.out.println("Switch Light");
        currentState = !currentState;
        System.out.println("Now " + (currentState ? "on" : "off"));
    }
    @Override
    public boolean getCurrentState() {
        return currentState;
    }
}
