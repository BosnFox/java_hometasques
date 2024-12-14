package org.src.tasque15;

public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": it is ''" + season.getStatus() + "'' time! Temperature is usually " + season.getTemperature());
        }
    }
}
