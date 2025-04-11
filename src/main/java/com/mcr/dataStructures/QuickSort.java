package com.mcr.dataStructures;

public class QuickSort {

    /// moves smaller elements to the left of a pivot and finding the final resting place of the pivot and then
    /// swap the pivot to its final resting place.
    /// recursively divide the array into two portions.
    ///
    /// run-time complexity -> Best case O(n log(n)) quasilinear time
    ///                        average case O(n log(n))
    ///                        worst case O(n^2) if already sorted
    ///
    /// space complexity -> O(log(n)) logarithmic space, due to recursion

    public static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    public static void main(String[] args) {

        int[] array = {8, 1, 9, 6, 5, 3, 7, 4, 2};

        quickSort(array, 0, array.length - 1);

        for(int i : array) System.out.print(i + "\t");

    }
}
