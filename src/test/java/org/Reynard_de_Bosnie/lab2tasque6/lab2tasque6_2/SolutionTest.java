package org.Reynard_de_Bosnie.lab2tasque6.lab2tasque6_2;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    void SimpleTest() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void LengthOneTest() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void Nums1EmptyTest() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int[] expected = {1, 2, 3};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void Nums1SmallerElementsTest() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void InterleavedSmallElementsTest() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void DuplicatesTest() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 3, 4};
        int n = 3;
        int[] expected = {1, 2, 2, 2, 3, 4};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void duplicatesAcrossArrays() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int[] expected = {1, 1, 2, 2, 3, 3};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void NullTest() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void PerformanceTest() {
        int mSize = 2000;
        int nSize = 2000;

        int[] nums1 = new int[mSize + nSize];
        int[] nums2 = new int[nSize];

        Random random = new Random(123);

        for (int i = 0; i < mSize; i++) {
            nums1[i] = random.nextInt(1000);
        }
        Arrays.sort(nums1, 0, mSize);

        for (int i = 0; i < nSize; i++) {
            nums2[i] = random.nextInt(1000);
        }
        Arrays.sort(nums2);
        long startTime = System.nanoTime();
        solution.merge(nums1, mSize, nums2, nSize);
        long endTime = System.nanoTime();
        long durationMillis = (endTime - startTime) / 1000000;
        System.out.println("Wall time: " + durationMillis + " ms");
    }
}
