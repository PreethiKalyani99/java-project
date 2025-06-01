package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOfTwoTest {
    private final LargestOfTwo l = new LargestOfTwo();

    @Test
    @DisplayName("Should return '5 is greater than 3' when first number is larger")
    void test1() {
        assertEquals("5 is greater than 3", l.findLargestNumber(5,3));
    }

    @Test
    @DisplayName("Should return '6 is greater than -6' when second number is larger")
    void test2() {
        assertEquals("6 is greater than -6", l.findLargestNumber(-6,6));
    }

    @Test
    @DisplayName("Should return 'Both are equal' when numbers are the same")
    void test3() {
        assertEquals("Both are equal", l.findLargestNumber(8,8));
    }
}
