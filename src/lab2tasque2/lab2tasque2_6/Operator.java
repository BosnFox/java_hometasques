package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Operator implements Runnable {
    private BlockingDeque<BadBoy> squewe1 =  new LinkedBlockingDeque<>();
    private BlockingDeque<BadBoy> squewe2 =  new LinkedBlockingDeque<>();
    public Operator(BlockingDeque<BadBoy> squewe1, BlockingDeque<BadBoy> squewe2) {
        this.squewe1 = squewe1;
        this.squewe2 = squewe2;
    }
    @Override
    public void run() {
        while (squewe2.size() < 10) {
            try {
            BadBoy b1 = squewe1.take();
            Thread.sleep(1000);
            squewe2.put(b1);
            System.out.println(b1 + " storaged"); } catch (InterruptedException e) {}
        }
    }
}
