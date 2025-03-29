package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> workerQueue = new ArrayBlockingQueue<String>(5);
        ArrayBlockingQueue<String> assemblerQueue = new ArrayBlockingQueue<String>(5);
        ArrayBlockingQueue<String> managerQueue = new ArrayBlockingQueue<String>(5);

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(new Worker(workerQueue));
        executor.submit(new Assembler(workerQueue, assemblerQueue));
        executor.submit(new Manager(assemblerQueue, managerQueue));

        executor.shutdown();
    }
}
