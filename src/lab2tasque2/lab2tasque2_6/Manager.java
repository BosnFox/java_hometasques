package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.ArrayBlockingQueue;

public class Manager implements Runnable {
    private final ArrayBlockingQueue<String> assemblerQueue;
    private final ArrayBlockingQueue<String> managerQueue;
    String passable;
    int time;
    public Manager(ArrayBlockingQueue<String> assemblerQueue,
                   ArrayBlockingQueue<String> managerQueue) {
        this.assemblerQueue = assemblerQueue;
        this.managerQueue = managerQueue;
    }
    @Override
    public void run() {
        while (true) {
            try
            {
                if (!assemblerQueue.isEmpty() && managerQueue.size() < 5) {
                    passable = assemblerQueue.take();
                    time = RandomTimer.getTime();
                    if (RandomTimer.getOpinion()) {
                        managerQueue.put(passable);
                        System.out.println("SELECTED " + passable + ", time spent: " + time + " ms");
                        System.out.println(managerQueue.size() < 5 ?
                                5 - managerQueue.size() + " still vacant" : "FULL");
                    }
                    else {
                        System.out.println("REJECTED " + passable + ", time spent: " + time + " ms");
                    }
                }
            }
            catch (Exception e) {}
        }
    }
}
