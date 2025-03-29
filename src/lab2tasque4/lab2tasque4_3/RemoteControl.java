package lab2tasque4.lab2tasque4_3;

import java.util.List;

public class RemoteControl {
    private List<Command> commandList;
    public RemoteControl(List<Command> commandList) {
        this.commandList = commandList;
    }
    public void addCommand(Command command) {
        commandList.add(command);
    }
    public void execute(int number) {
        commandList.get(number).execute();
    }
    public void totalShutdown() {
        System.out.println("Y'all getting to sleep...");
        for (Command command : commandList) {
            if (command.getCurrentState()) {
                command.execute();
            }
        }
    }
}
