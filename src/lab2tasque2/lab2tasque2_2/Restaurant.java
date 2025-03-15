package lab2tasque2.lab2tasque2_2;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<String> dishes = new ArrayList<>();
    private final int CAPACITY = 3;

    public synchronized void addDish(String dishName) throws InterruptedException {
        while (dishes.size() >= CAPACITY) {
            System.out.println("O'er-loaded for now...");
            wait();
        }
        dishes.add(dishName);
        System.out.println(dishName + " added");
        notify();
    }

    public synchronized String takeDish() throws InterruptedException {
        while (dishes.isEmpty()) {
            System.out.println("None to serve");
            wait();
        }
        String dish = dishes.remove(0);
        System.out.println(dish + " served");
        notify();
        return dish;
    }
}
