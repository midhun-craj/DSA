package com.mcr.dataStructures;

public class BigONotation {
    /// Big O Notation
    /// Describes the performance of an algorithm as the amount of data increases.
    /// Machine independent (# of steps to completion)
    /// Ignore smaller operations O(n + 1) -> O(n)

    /// Scale from best to worst
    /// O(1) -> constant time
    /// O(log n)
    /// O(n) -> linear time
    /// O(n log n)
    /// O(n^2)
    /// O(n!)
    /// Where n is the amount of data.

    /// The below code takes O(n) time, linear time. As the data increases the number of steps also increases.
    /// int addUp(int n) {
    ///     int sum = 0;
    ///     for (int i = 0; i < n; i++) {
    ///         sum += i;
    ///     }
    ///     return sum;
    /// }

    /// The below code takes O(1) time, constant time. The number of steps doesn't dependent on the input data.
    /// int addUp(int n) {
    ///     int sum = n * (n + 1) / 2;
    ///     return sum;
    /// }

    /// O(1) = constant time
    ///      * Random access of element in an array.
    ///      * Inserting at the beginning of a linked list.

    /// O(log n) = logarithmic time
    ///          * Binary search

    /// O(n) = linear time
    ///      * Looping through elements in an array
    ///      * Searching through a linked list

    /// O(n log n) = quasilinear time
    ///            * Quick sort
    ///            * Merge sort
    ///            * Heap sort

    /// O(n^2) = quadratic time
    ///        * Insertion sort
    ///        * Selection sort
    ///        * Bubble sort

    /// O(n!) = factorial time
    ///       * Travelling salesman problem

}
