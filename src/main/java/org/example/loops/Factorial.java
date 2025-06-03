package org.example.loops;

public class Factorial {
    public int getFactorialOfANumber (int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
