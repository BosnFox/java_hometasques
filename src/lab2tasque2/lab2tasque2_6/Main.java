package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<BadBoy> stampingBadBoys = new LinkedBlockingDeque<BadBoy>();
        BlockingDeque<BadBoy> assemblingBadBoys = new LinkedBlockingDeque<BadBoy>();
        BlockingDeque<BadBoy> operatingBadBoys = new LinkedBlockingDeque<BadBoy>();

        ExecutorService exec = Executors.newCachedThreadPool();

        exec.submit(new Assembler(stampingBadBoys, assemblingBadBoys));
        exec.submit(new Operator(assemblingBadBoys, operatingBadBoys));
        exec.submit(new Stamper(stampingBadBoys));

        exec.shutdown();
    }
}
