package org.example.loops;

public class SumOfNumbers {
    public int sumOfNaturalNumbers (int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
