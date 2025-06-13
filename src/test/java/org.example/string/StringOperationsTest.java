package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringOperationsTest {
    StringOperations so = new StringOperations("Some random text");

    @Test
    void shouldConcatenateGivenTwoStrings () {
        assertEquals("""
                Some random text THis is multi line
                string
                """,
                so.concatenate2Strings("Some random text", """
                THis is multi line
                string
                """));
    }

    @Test
    void shouldConcatenateArrayOfString () {
        assertEquals("onetwothree", so.concatenateArrayOfString(new String[] {"one", "two", "three"}));
    }

    @Test
    void shouldReturnSubstringWithGivenRange () {
        assertEquals("Some r", so.getSubstring(0, 6));
    }

    @Test
    void shouldThrowErrorWhenStartIndexIsGreaterThanEndIndex () {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> so.getSubstring(4, 2));

        assertEquals("Invalid start or end index", exception.getMessage());
    }

    @Test
    void shouldConvertGivenStringToUppercase () {
        assertEquals("UPPERCASE STRING", so.convertCase("uppercase String", CaseType.UPPER));
    }

    @Test
    void shouldConvertGivenStringToLowercase () {
        assertEquals("lowercase string", so.convertCase("Lowercase String", CaseType.LOWER));
    }

    @Test
    void shouldReturnTheCharacterAtGivenIndex () {
        assertEquals('m', so.getChar(2));
    }

    @Test
    void shouldThrowErrorIfIndexIsGreaterThanStringLength () {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> so.getChar(22));

        assertEquals("Invalid index", exception.getMessage());
    }
}