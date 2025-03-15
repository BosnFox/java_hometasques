package lab2tasque2.lab2tasque2_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " main");

        Restaurant rest = new Restaurant();
        Cook cook = new Cook(rest);
        Servant servant = new Servant(rest);

        new Thread(cook).start();
        new Thread(servant).start();
    }
}
