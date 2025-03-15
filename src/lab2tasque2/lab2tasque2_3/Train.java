package lab2tasque2.lab2tasque2_3;

public class Train extends Thread {

    private final Rails rails;

    public Train(Rails rails) {
        this.rails = rails;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                rails.trainIncoming();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
