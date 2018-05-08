package com.musala.practice;

import java.util.List;

public class Median {
    /**
     * @param numbers arraylist with elements
     * @return index of median in array if array size is odd number, else returns -1.
     */
    public int findMedianIndex(List<Integer> numbers) {
        int sumLeft = 0;
        int sumRight = 0;
        int median = 1;
        int difference = Integer.MAX_VALUE;
        int sum;
        int closestToMedian = 0;
        for (int k = 0; k < numbers.size(); k++) {
            for (int i = 0; i < median; i++) {
                sumLeft += numbers.get(i);
            }
            for (int i = median + 1; i < numbers.size(); i++) {
                sumRight += numbers.get(i);
            }
            if (sumLeft == sumRight) {
                return median;
            } else {
                sum = Math.abs(sumLeft - sumRight);
                if (difference > sum) {
                    difference = sum;
                    closestToMedian = median;
                }
                median++;
                sumLeft = sumRight = 0;
            }
        }
        return closestToMedian;
    }
}
