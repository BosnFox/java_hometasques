package lab2tasque2.lab2tasque2_5;

public class Car implements Runnable{

    private final Doroha doroha;

    public Car(Doroha doroha) {
        this.doroha = doroha;
    }
    @Override
    public void run() {
        while(true) {
            try {
                doroha.car("gyatt");
            }
            catch(Exception e) {}
        }
    }
}
