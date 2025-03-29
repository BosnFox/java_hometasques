package lab2tasque3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a, b));
    }
}
