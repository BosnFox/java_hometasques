package lab2tasque2.lab2tasque2_3;

public class Car extends Thread {
    private String carName;
    private final Rails rails;

    public Car(String name, Rails rails) {
        this.carName = name;
        this.rails = rails;
    }

    @Override
    public void run() {
        try {
            while (true) {rails.carIncoming(carName); Thread.sleep(1000);}
        }
        catch (InterruptedException ex) {}
    }
}