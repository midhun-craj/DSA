package com.mcr.dataStructures;

public class SelectionSort {

    /// Search through the array and keep track of the minimum value during each iteration.
    /// And at the end of each iteration we swap the variables.
    ///
    /// run-time complexity -> Quadratic time O(n^2)
    /// space complexity -> O(1) constant time
    /// small datasets = okay
    /// large datasets = bad

    public static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = {8, 6, 1, 4, 2, 7, 9, 5, 3};

        selectionSort(array);

        for (int i : array) System.out.print(i + "\t");
    }
}
