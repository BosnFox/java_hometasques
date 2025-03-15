package lab2tasque2.lab2tasque2_4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory();

        Worker worker = new Worker(factory);
        Acquirer acquirer = new Acquirer(factory);

        Thread t2 = new Thread(acquirer);
        t2.start();
        Thread t1 = new Thread(worker);
        t1.start();
        Thread.sleep(5000);
        t1.interrupt();
        t2.interrupt();
    }
}