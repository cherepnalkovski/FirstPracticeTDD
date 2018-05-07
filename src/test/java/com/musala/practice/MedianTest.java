package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for class that finds median number index in unsorted array.
 * Returns position index of median number in array or -1 if there are even number of elements in array.
 */
public class MedianTest {

    @Test
    public void test_findMedianNumberOdd() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 41, 7, 9, 2, 15, 23, 1, 99));
        Median median = new Median(numbers);
        int index;
        index = median.findMedianIndex(numbers);
        assertNotNull(median);
        assertEquals(0, index);
    }

    @Test
    public void test_findMedianNumberEven() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 41, 7, 9, 2, 15, 23, 1, 99, 100));
        Median median = new Median(numbers);
        int index;
        index = median.findMedianIndex(numbers);
        assertNotNull(median);
        assertEquals(-1, index);
    }
}
