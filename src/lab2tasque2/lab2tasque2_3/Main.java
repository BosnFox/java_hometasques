package lab2tasque2.lab2tasque2_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Rails rails = new Rails();
        for (int i = 0; i < 10; i++) {
            int curr = i;
            Car car = new Car("nyaga " + curr, rails);
            new Thread(car).start();
        }
        new Train(rails).start();
    }
}