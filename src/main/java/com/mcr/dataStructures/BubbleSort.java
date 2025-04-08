package com.mcr.dataStructures;

public class BubbleSort {

    /// Compare pairs of adjacent elements, and swap the elements if they are not in order.
    ///
    /// Quadratic time O(n^2)
    /// small data-set = ok-ish
    /// large data-set = Nop

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                while (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {8, 6, 3, 5, 9, 1, 4, 2, 7};
        bubbleSort(array);

        for (int i : array) System.out.print(i + "\t");
    }
}
