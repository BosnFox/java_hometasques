package lab2tasque2.lab2tasque2_6;

import java.util.concurrent.BlockingQueue;

public class Assembler implements Runnable {
    private final BlockingQueue<BadBoy> esquewe1;
    private final BlockingQueue<BadBoy> esquewe2;
    public Assembler(BlockingQueue<BadBoy> esquewe, BlockingQueue<BadBoy> esquewe2) {
        this.esquewe1 = esquewe;
        this.esquewe2 = esquewe2;
    }
    @Override
    public void run() {
        while (esquewe1.size() > 0) {
            try {
                BadBoy b = esquewe1.take();
                Thread.sleep(1000);
                esquewe2.put(b);
                System.out.println(b + " put");}
            catch (InterruptedException e) {}
        }
    }
}
