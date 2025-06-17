package org.example.logical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseOrderTest {
    ReverseOrder r = new ReverseOrder();

    @Test
    void shouldReverseTheGivenInteger () {
        assertEquals(54321, r.reverseInteger(12345));
    }

    @Test
    void shouldReverseTheGivenString () {
        assertEquals("olleH", r.reverseString("Hello"));
    }
}
