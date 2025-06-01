package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {
    private final EvenOdd eo = new EvenOdd();

    @Test
    void testOddNumber() {
        assertEquals("Odd", eo.checkEvenOrOdd(5));
    }

    @Test
    void testEvenNumber() {
        assertEquals("Even", eo.checkEvenOrOdd(8));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("Odd", eo.checkEvenOrOdd(-15));
    }

    @Test
    void testZero() {
        assertEquals("Even", eo.checkEvenOrOdd(0));
    }
}