package org.example;

public class TriangleNumberCalculator {

    // Recursive method to calculate the nth triangular number
    public int value(int n) {
        if (n <= 1) { // Base case: T1 = 1, T0 = 0
            return n;
        }
        return n + value(n - 1); // Recursive step
    }

    // Add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Subtract the mth triangular number from the nth
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}
