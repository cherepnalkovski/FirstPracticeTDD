package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void test_mergeSortImplementation() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(11, -1, 41, 7, 9, 2, 15, 23, 1, 99, 100));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, 1, 2, 7, 9, 11, 15, 23, 41, 99, 100));
        MergeSort mergeSort = new MergeSort();
        List<Integer> sortedList = mergeSort.customSort(numbers, 0, numbers.size());
        assertNotNull(mergeSort);
        assertEquals(expected, sortedList);
    }

    @Test
    public void test_mergeSortWithEmptyArray() {
        List<Integer> empty = new ArrayList<>();
        MergeSort mergeSort = new MergeSort();
        List<Integer> sortedList = mergeSort.customSort(empty, 0, empty.size());
        assertNotNull(mergeSort);
        assertTrue(sortedList.isEmpty());
    }
}
