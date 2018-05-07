package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SubArraySumTest {

    @Test
    public void test_subArrayMaxSum() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 1, 0, 4, 1, -4, 1, 5, -3, 6, 1, 2, 5, -1, 10));
        SubArraySum subArraySum = new SubArraySum(numbers);
        int maxSum = subArraySum.calculateSubArraySum(numbers);
        assertNotNull(subArraySum);
        assertEquals(23, maxSum);
    }

}
