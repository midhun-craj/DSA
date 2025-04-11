package com.mcr.dataStructures;

public class MergeSort {

    /// Divide and Conquer Methodology
    /// Recursively divide an array into two, sort and combine.
    ///
    /// run-time complexity -> O(n log n) quasilinear time
    /// space complexity -> O(n) linear space

    public static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0, j = 0;

        for(; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {

        int[] array = {8, 1, 5, 2, 9, 3, 6, 4, 7};

        mergeSort(array);

        for (int i : array) System.out.print(i + "\t");
    }
}
