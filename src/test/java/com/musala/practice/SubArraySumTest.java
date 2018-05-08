package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for class that find largest sum of subarray elements.
 */
public class SubArraySumTest {

    @Test
    public void test_subArrayMaxSum() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 1, 0, 4, 1, -4, 1, 5, -3, 6, 1, 2, 5, -1, 10));
        SubArraySum subArraySum = new SubArraySum();
        int maxSum = subArraySum.calculateSubArraySum(numbers);
        assertNotNull(subArraySum);
        assertEquals(14, maxSum);
    }

    @Test
    public void test_EmptysubArrayMaxSum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        SubArraySum subArraySum = new SubArraySum();
        int maxSum = subArraySum.calculateSubArraySum(numbers);
        assertNotNull(subArraySum);
        assertEquals(0, maxSum);
    }

}
