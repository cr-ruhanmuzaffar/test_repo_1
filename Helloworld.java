package com.example;

/**
 * A simple utility class for basic arithmetic operations.
 */
public final class MathUtils {

    private MathUtils() {
        // Private constructor to prevent instantiation
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
}