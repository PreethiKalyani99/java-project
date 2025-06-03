package org.example.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfNumbersTest {
    private final SumOfNumbers sumOfNumbers = new SumOfNumbers();

    @Test
    @DisplayName("Returns the sum of the first 5 natural numbers as 15")
    void testSumOf5 () {
        assertEquals(15, sumOfNumbers.sumOfNaturalNumbers(5));
    }

    @Test
    @DisplayName("Throws exception for negative input")
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> sumOfNumbers.sumOfNaturalNumbers(-5));
    }

    @Test
    @DisplayName("Returns 0 for input 0")
    void testZero () {
        assertEquals(0, sumOfNumbers.sumOfNaturalNumbers(0));
    }
}
