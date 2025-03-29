package lab2tasque3.lab2tasque3_1;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier startLine = new CyclicBarrier(5, () -> System.out.println("RACE BEGINS!!!"));

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Runner(i, startLine));
        }
        executorService.shutdown();
    }
}
