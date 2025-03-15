package lab2tasque2.lab2tasque2_5;

public class Doroha {

    private CanGo currentState = CanGo.NO;

    public Doroha() {

    }

    public synchronized CanGo getCurrentState() {
        return currentState;
    }

    public synchronized void trans() {
        try
        {
            currentState = (currentState == CanGo.YES) ? CanGo.NO : CanGo.YES;
            System.out.println((currentState == CanGo.YES) ? "can go" : "can go noht");
            Thread.sleep(5000);
            notifyAll();
        } catch (Exception e) {}
    }


    public synchronized void car(String name) {
        try
        {
            System.out.println(name + " incomes");
            while (getCurrentState() == CanGo.NO) {
                System.out.println(name + " awaits");
                wait();
            }
            Thread.sleep(1000);
            System.out.println("off it goes");
        } catch (Exception e) {}
    }
}