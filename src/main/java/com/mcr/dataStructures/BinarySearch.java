package com.mcr.dataStructures;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinarySearch {

    /// Searching algorithm that finds the position of the target value within a sorted array.
    /// Half of the array is eliminated during each step.
    ///
    /// It is more efficient in larger datasets when comparing with the smaller datasets.
    /// run time complexity is -> O(log n), logarithmic time.
    /// which means it becomes more and more efficient when dealing with larger datasets as during each step it
    /// eliminates half the array.

    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

//            int middle = (low + high) / 2;
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println(value);

            if (value < target) low = middle + 1;
            else if (value > target ) high = middle - 1;
            else return middle; // target found.
        }
        return -1; // target not found.
    }

    public static void main(String[] args) {

        int[] array = new int[100000];
        int target = 88888;

        IntStream.range(0, array.length)
                .forEach(i -> array[i] = i);

//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1) System.out.println(target +"\tnot found.");
        else System.out.println("Element found at index:\t" + index);
    }
}
