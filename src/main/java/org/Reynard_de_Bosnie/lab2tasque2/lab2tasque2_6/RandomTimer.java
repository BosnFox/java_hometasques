package org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6;

import java.util.Random;

public class RandomTimer {
    public static int getTime() {
        int[] test = {500, 1000, 2000, 2500, 5000};
        return test[new Random().nextInt(test.length)];
    }
    public static boolean getOpinion() {
        boolean[] opinion = {true, true, false, true, true};
        return opinion[new Random().nextInt(opinion.length)];
    }
}
