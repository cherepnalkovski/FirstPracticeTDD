package com.musala.practice;

import java.util.List;

public class MergeSort {

    public List<Integer> customSort(List<Integer> numbers, int low, int high) {
        int size = high - low;
        if (size <= 1) {
            return numbers;
        }
        int mid = low + size / 2;

        //sort left
        customSort(numbers, low, mid);

        //sort right
        customSort(numbers, mid, high);

        int[] temp = new int[size];
        int i = low;
        int j = mid;
        for (int k = 0; k < size; k++) {
            if (i == mid)
                temp[k] = numbers.get(j++);
            else if (j == high)
                temp[k] = numbers.get(i++);
            else if (numbers.get(j) < numbers.get(i))
                temp[k] = numbers.get(j++);
            else
                temp[k] = numbers.get(i++);
        }
        for (int k = 0; k < size; k++) {
            numbers.set(low + k, temp[k]);
        }
        return numbers;
    }
}
