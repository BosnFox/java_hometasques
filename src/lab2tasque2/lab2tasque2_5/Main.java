package lab2tasque2.lab2tasque2_5;

public class Main {
    public static void main(String[] args) {
        Doroha Doroha = new Doroha();

        Car car = new Car(Doroha);
        Tranfs trans = new Tranfs(Doroha);

        new Thread(car).start();
        new Thread(trans).start();
    }
}
