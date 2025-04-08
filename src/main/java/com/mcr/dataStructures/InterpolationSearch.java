package com.mcr.dataStructures;

public class InterpolationSearch {

    /// Improvements over binary search best used for uniformly distributed data
    /// It guesses where a value might be based on calculated probe results
    /// If probe is incorrect, search area is narrowed and a new probe is calculated
    ///
    /// average case: O(log(log n))
    /// worst case: O(n) values increases exponentially

    public static int interpolationSearch(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;

        while(value >= array[low] && value <= array[high] && low <= high) {

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe:\t" + probe);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;
        }

        return -1; // Sentinel value
    }

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        int index = interpolationSearch(array, 256);

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index:\t" + index);
        }
    }
}
