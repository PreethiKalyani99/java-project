package org.example.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseANumberTest {
    private final ReverseANumber r = new ReverseANumber();

    @Test
    void shouldReturn54321ForInput12345 () {
        assertEquals(54321, r.reverseANumber(12345));
    }

    @Test
    void shouldReturn1ForInput1 () {
        assertEquals(1, r.reverseANumber(1));
    }

    @Test
    void shouldThrowErrorForNegativeInput () {
        assertThrows(IllegalArgumentException.class, () -> r.reverseANumber(-543));
    }
}
