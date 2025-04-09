package com.mcr.dataStructures;

import java.util.stream.IntStream;

public class Recursion {

    /// When a thing is defined in terms of itself.
    /// Applying the result of a procedure to a procedure.
    ///
    /// A recursive method calls itself. Can be a substitute for iteration.
    /// Divides a problem into sub-problems of the same type as the original.
    /// Commonly used with advanced sorting algorithms and navigating trees.
    ///
    /// Advantages:
    /// easier to read/write.
    /// easier to debug.
    ///
    /// Disadvantages:
    /// sometimes slower.
    /// uses more memory.
    ///
    /// **********Iteration Vs Recursion**********
    /// Iteration uses loops as recursion calls itself.
    /// Iteration moves towards the value in the condition as recursion moves towards the base case.
    /// Iteration terminates when the index satisfies the condition, recursion terminates when base case is true.
    /// Iteration has more code less memory whereas recursion has less code more memory.
    /// Iteration is faster than recursion.


    public static void walk(int n) {
        // iterative approach
//        IntStream.range(0, n)
//                .forEach(i -> System.out.println("You take a step."));

        // recursive approach
        if (n < 1) return;  // base case
        System.out.println("You take a step.");
        walk(n - 1); // recursive case
    }

    public static int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    public static int power(int base, int exponent) {
        if (exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

//        walk(5);
        System.out.println(factorial(5));
        System.out.println(power(8, 2));
    }
}
