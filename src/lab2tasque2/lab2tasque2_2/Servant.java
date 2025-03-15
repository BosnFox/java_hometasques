package lab2tasque2.lab2tasque2_2;

import java.util.Random;

public class Servant implements Runnable {
    private final Restaurant restaurant;

    public Servant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": servant");
            while (true) {
                String dish = restaurant.takeDish();
                System.out.println(dish + " serving");
                Thread.sleep(new int[] {1000, 5000, 500}[new Random().nextInt(2)]);
            }
        } catch (Exception e) {}
    }
}
