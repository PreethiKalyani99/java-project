package org.example.type_casting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExplicitTCTest {
    ExplicitTC e = new ExplicitTC();

    @Test
    void shouldConvertAValueFromDoubleToInt () {
        assertEquals(20, e.convertDoubleToInt(20.43));
    }
}
