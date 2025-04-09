package com.mcr.dataStructures;

public class InsertionSort {

    /// After comparing elements to the left.
    /// Shift elements to the right to make room to insert a value.
    ///
    /// Quadratic time O(n^2)
    /// small dataset = decent
    /// large dataset = bad
    ///
    /// lesser steps that bubble sort
    /// Best case is O(n) compared to the selection sort O(n^2)

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = {7, 1, 9, 5, 3, 6, 8, 2, 4};

        insertionSort(array);

        for (int i : array) System.out.print(i + "\t");

    }
}
