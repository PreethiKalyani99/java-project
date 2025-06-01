package org.example;

public class LargestOfTwo {
    public String findLargestNumber (int num1, int num2) {
        if (num1 > num2) {
            return String.format("%d is greater than %d", num1, num2);
        }
        else if (num1 == num2) {
            return "Both are equal";
        }
        return String.format("%d is greater than %d", num2, num1);
    }
}
