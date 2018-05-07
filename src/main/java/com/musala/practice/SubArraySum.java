package com.musala.practice;

import java.util.List;

/**
 * Find the contiguous subarray within an array which has the largest sum
 */
public class SubArraySum {
    public SubArraySum(List<Integer> numbers) {
    }

    /**
     * Find the contiguos subarray within an array which has the largest sum of elements.
     *
     * @param numbers array list with numbers
     * @return largest sum of subarray elements
     */
    public int calculateSubArraySum(List<Integer> numbers) {
        int maxSum = 0;
        int currentSum = 0;
        int subListSize;
        for (int i = 0; i < numbers.size(); i++) {
            subListSize = numbers.get(i);
            if (subListSize < 0) {
                continue;
            }
            int j = i + subListSize;
            for (int p = i; p <= j; p++) {
                if (p >= numbers.size()) {
                    break;
                }
                currentSum += numbers.get(p);
            }
            maxSum = currentSum > maxSum ? currentSum : maxSum;
            currentSum = 0;
            i = j;
        }
        return maxSum;
    }
}
