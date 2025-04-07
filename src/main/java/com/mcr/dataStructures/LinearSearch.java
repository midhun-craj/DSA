package com.mcr.dataStructures;

import java.util.stream.IntStream;

public class LinearSearch {

    /// Iterate through a collection one element at a time.
    /// run time complexity -> O(n)
    /// Slow for large datasets.
    /// Fast for searches of small to medium data sets.
    /// Does not need to be sorted.
    /// Useful for data structures that doesn't have random access. (linked list)

    public static int linearSearch(int[] array, int value) {
        return IntStream.range(0, array.length)
                    .filter(i -> array[i] == value)
                    .findFirst()
                    .orElse(-1);
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 3, 6, 8, 4, 7, 5, 2};
        int index = linearSearch(array, 2 );

        if (index != -1) {
            System.out.println("Element found at index:\t" + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
