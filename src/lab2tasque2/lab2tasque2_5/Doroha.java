package lab2tasque2.lab2tasque2_5;

public class Doroha {

    public CanGo currentState = CanGo.NO;

    public Doroha() {

    }

    public synchronized void trans() {
        try
        {
            currentState = (currentState == CanGo.YES) ? CanGo.NO : CanGo.YES;
            System.out.println((currentState == CanGo.YES) ? "can go" : "can go noht");
            notifyAll();
            Thread.sleep(1000);
        } catch (Exception e) {}
    }


    public synchronized void car(String name) {
        try
        {
            System.out.println(name + " incomes");
            while (currentState == CanGo.NO) {
                System.out.println(name + " awaits");
                wait();
            }
            Thread.sleep(100);
            System.out.println("off it goes");
            notifyAll();
        } catch (Exception e) {}
    }
}