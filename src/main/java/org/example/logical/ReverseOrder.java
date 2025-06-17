package org.example.logical;

public class ReverseOrder {
    public int reverseInteger(int input) {
        int reversed = 0;

        while (input > 0) {
            int digit = input % 10;
            reversed = reversed * 10 + digit;
            input /= 10;
        }
        return reversed;
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
