package lab2tasque2.lab2tasque2_6;

import java.util.Random;

public class RandomTimer {
    public static int getTime() {
        int[] test = {500, 1000, 2000, 5000};
        return test[new Random().nextInt(test.length)];
    }
    public static boolean getOpinion() {
        boolean[] opinion = {true, false};
        return opinion[new Random().nextInt(opinion.length)];
    }
}
