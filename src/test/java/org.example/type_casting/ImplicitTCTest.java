package org.example.type_casting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplicitTCTest {
    ImplicitTC i = new ImplicitTC();

    @Test
    void shouldConvertAValueFromIntegerToDouble () {
        assertEquals(20.0, i.convertIntToDouble(20));
    }

    @Test
    void shouldConvertAValueFromShortToLong () {
        assertEquals(12345L, i.convertShortToLong((short) 12345));
    }
}