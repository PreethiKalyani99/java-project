package org.example.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    private final Factorial f = new Factorial();

    @Test
    void shouldReturn120ForInput5 () {
        assertEquals(120, f.getFactorialOfANumber(5));
    }

    @Test
    void shouldReturn1ForInput0 (){
        assertEquals(1, f.getFactorialOfANumber(0));
    }

    @Test
    void shouldThrowExceptionForNegativeInput () {
        assertThrows(IllegalArgumentException.class, () -> f.getFactorialOfANumber(-4));
    }
}
