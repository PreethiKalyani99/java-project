package org.example.loops;

public class ReverseANumber {
    public int reverseANumber (int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        int reversedNumber = 0;

        while(number != 0) {
            reversedNumber = reversedNumber * 10 + ( number % 10 );
            number /= 10;
        }

        return reversedNumber;
    }
}
