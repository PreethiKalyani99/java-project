package org.example.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfArrayTest {
    private final SumOfArray s = new SumOfArray();

    @Test
    void shouldReturnSumForPositiveIntegersInput () {
        assertEquals(11, s.sumOfArray(new int[] {1,2,3,5}));
    }

    @Test
    void shouldReturnSumForNegativeIntegersInput () {
        assertEquals(-11, s.sumOfArray(new int[] {-1,-2,-3,-5}));
    }

    @Test
    void shouldReturn0ForEmptyArray () {
        assertEquals(0, s.sumOfArray(new int[] {}));
    }
}
