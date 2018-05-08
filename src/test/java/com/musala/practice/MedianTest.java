package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for class that finds median number index in array.
 */
public class MedianTest {

    @Test
    public void test_findClosestMedianNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 2, 7));
        Median median = new Median();
        int index;
        index = median.findMedianIndex(numbers);
        assertNotNull(median);
        assertEquals(3, index);
    }

    @Test
    public void test_findMedianNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, -10, 0, 1));
        Median median = new Median();
        int index;
        index = median.findMedianIndex(numbers);
        assertNotNull(median);
        assertEquals(2, index);
    }
}
