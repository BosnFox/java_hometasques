package lab2tasque2.lab2tasque2_4;

public class Acquirer implements Runnable {
    private final Factory plant;

    public Acquirer(Factory plant) {
        this.plant = plant;
    }

    @Override
    public void run() {
        while (true) {
            try {
                plant.consume("smth");
            }
            catch (InterruptedException e) {}
        }
    }
}
