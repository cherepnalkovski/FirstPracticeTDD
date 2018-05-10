package com.musala.practice;

import java.util.List;

/**
 * Class used to find index of the median element of an array, or the element closest to median, if median does not exist.
 * A median is such an element that the difference of the sums of the elements in the left and the right are equal.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class Median {
    /**
     * @param numbers array list with elements
     * @return index of median or index of number closest to median if median number does not exists.
     */
    public int findMedianIndex(List<Integer> numbers) {
        int sumLeft = 0;
        int sumRight = 0;
        int median = 0;
        int minimalDifference = Integer.MAX_VALUE;
        int difference;
        int closestToMedian = 0;
        for (int number : numbers) {
            sumRight += number;
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (sumLeft == sumRight) {
                return median;
            } else {
                sumLeft += numbers.get(median);
                sumRight -= numbers.get(median);
                difference = Math.abs(sumLeft - sumRight);
                if (minimalDifference > difference) {
                    minimalDifference = difference;
                    closestToMedian = median;
                    median++;
                }
            }
        }
        return closestToMedian;
    }
}
