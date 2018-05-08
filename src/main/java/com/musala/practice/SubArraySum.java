package com.musala.practice;

import java.util.List;

/**
 * Find the contiguous subarray within an array which has the largest sum.
 */
public class SubArraySum {

    /**
     * Find the contiguos subarray within an array which has the largest sum of elements.
     *
     * @param numbers array list with numbers
     * @return largest sum of subarray elements
     */
    public int calculateSubArraySum(List<Integer> numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        for (int number : numbers) {
            currentSum += number;
            if (currentSum >= maxSum) {
                maxSum = currentSum;
            } else {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
