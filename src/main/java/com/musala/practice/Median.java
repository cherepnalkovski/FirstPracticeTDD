package com.musala.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Median {
    public Median(List<Integer> numbers) {
    }

    /**
     * @param numbers arraylist with elements
     * @return index of median in array if array size is odd number, else returns -1.
     */
    public int findMedianIndex(List<Integer> numbers) {
        ArrayList<Integer> sortedList = new ArrayList<>(numbers);
        sortedList.sort(Comparator.naturalOrder());
        if (sortedList.size() % 2 == 0) {
            return -1;
        }
        int median;
        int middle;
        middle = (sortedList.size() - 1) / 2;
        median = sortedList.get(middle);
        return numbers.indexOf(median);
    }
}
