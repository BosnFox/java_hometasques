package lab2tasque2.lab2tasque2_2;

import java.util.Random;

public class Cook implements Runnable {
    private final Restaurant restaurant;
    private int dishCount = 1;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Waiting for restaurant " + restaurant);
            while (true) {
                System.out.println("gyatt numero " + dishCount++ + " preparing");
                Thread.sleep(new int[] {500, 2000, 1000}[new Random().nextInt(2)]);
                restaurant.addDish("gyatt " + dishCount++);
            }
        } catch (Exception e) {}
    }
}
