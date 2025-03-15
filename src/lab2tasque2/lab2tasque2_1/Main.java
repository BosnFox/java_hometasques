package lab2tasque2.lab2tasque2_1;

public class Main {
    public static void main(String[] args) {
        GasStation statjon = new GasStation(2);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> statjon.gasRefill(String.format("Car %s", finalI))).start();
        }
    }
}
