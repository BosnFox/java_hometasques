package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Stamper implements Runnable {
    private BlockingDeque<BadBoy> squewe =  new LinkedBlockingDeque<BadBoy>();
    private String lastBB = "goy";
    public Stamper(BlockingDeque<BadBoy> squewe) {
        this.squewe = squewe;
    }

    @Override
    public void run() {
        while (squewe.size() < 10) {
            squewe.addLast(new BadBoy(lastBB));
            System.out.println(lastBB + " wrought");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lastBB = lastBB + '1';
            squewe.addLast(new BadBoy(lastBB));
        }
    }
}
