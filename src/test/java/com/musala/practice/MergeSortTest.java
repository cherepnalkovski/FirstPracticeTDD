package com.musala.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for class {@link MergeSort} used to implement merge sort algorithm.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class MergeSortTest {

    @Test
    public void test_mergeSortImplementation() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(11, -1, 41, 7, 9, 2, 15, 23, 1, 99, 100));
        List<Integer> expected = new ArrayList(numbers);
        expected.sort(Comparator.naturalOrder());
        MergeSort mergeSort = new MergeSort();
        List<Integer> sortedList = mergeSort.sort(numbers, 0, numbers.size());
        assertNotNull(mergeSort);
        assertEquals(expected, sortedList);
    }

    @Test
    public void test_mergeSortWithEmptyArray() {
        List<Integer> empty = new ArrayList<>();
        MergeSort mergeSort = new MergeSort();
        List<Integer> sortedList = mergeSort.sort(empty, 0, empty.size());
        assertNotNull(mergeSort);
        assertTrue(sortedList.isEmpty());
    }
}
