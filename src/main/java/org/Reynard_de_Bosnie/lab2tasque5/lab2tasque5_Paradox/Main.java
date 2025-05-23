package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_Paradox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int StayWinsCounter = 0;
        int HitMeWinsCounter = 0;
        for (int i = 0; i < 1000000; i++) {
            int prizeDoor = random.nextInt(3);
            int playerInitialChoice = random.nextInt(3);
            int doorOpenedByHost = -1;
            if (playerInitialChoice == prizeDoor) {
                List<Integer> doorsHostCanOpen = new ArrayList<>();
                for (int door = 0; door < 3; door++) {
                    if (door != playerInitialChoice) {
                        doorsHostCanOpen.add(door);
                    }
                }
                doorOpenedByHost = doorsHostCanOpen.get(random.nextInt(doorsHostCanOpen.size()));
            } else {
                for (int door = 0; door < 3; door++) {
                    if (door != playerInitialChoice && door != prizeDoor) {
                        doorOpenedByHost = door;
                        break;
                    }
                }
            }
            if (playerInitialChoice == prizeDoor) {
                StayWinsCounter++;
            }
            int switchedChoice = -1;
            for (int door = 0; door < 3; door++) {
                if (door != playerInitialChoice && door != doorOpenedByHost) {
                    switchedChoice = door;
                    break;
                }
            }
            if (switchedChoice == prizeDoor) {
                HitMeWinsCounter++;
            }
        }
        System.out.println("Stay strategy: " + ((double) StayWinsCounter / 1000000));
        System.out.println("Hit-me strategy: " + ((double) HitMeWinsCounter / 1000000));
    }
}
