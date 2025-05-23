package org.Reynard_de_Bosnie.lab2tasque6.lab2tasque6_1;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Random;
import static org.junit.Assert.*;

class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    void SimpleTest() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void NoZeroSimpleTest() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void EmptyArrayTest() {
        int[] arr = {};
        int[] expected = {};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void OneZeroTest() {
        int[] arr = {0};
        int[] expected = {0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void OneOneTest() {
        int[] arr = {1};
        int[] expected = {1};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void ZeroInitialTest() {
        int[] arr = {0, 0, 1, 2};
        int[] expected = {0, 0, 0, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void NoChangeTest() {
        int[] arr = {1, 2, 0, 0};
        int[] expected = {1, 2, 0, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void ComplexTest() {
        int[] arr = {0, 1, 1, 0, 2, 0, 1, 0, 0};
        int[] expected = {0, 0, 1, 1, 0, 0, 2, 0, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void PerformanceTest() {
        int size = 10000;
        int[] arr = new int[size];
        Random random = new Random(42);
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        Solution solution = new Solution();
        long startTime = System.nanoTime();
        solution.duplicateZeros(arr);
        long endTime = System.nanoTime();
        long durationMillis = (endTime - startTime) / 1000000;
        System.out.println("Wall time: " + durationMillis + " ms");
    }
}