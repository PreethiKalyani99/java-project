package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelConsonantCheckerTest {
    private final VowelConsonantChecker vc = new VowelConsonantChecker();

    @Test
    @DisplayName("'E' is a vowel")
    void test1 () {
        assertEquals("Vowel", vc.checkVowelOrConsonant('E'));
    }

    @Test
    @DisplayName("'Z' is a consonant")
    void test2 () {
        assertEquals("Consonant", vc.checkVowelOrConsonant('Z'));
    }

    @Test
    @DisplayName("'6' is invalid input")
    void test3 () {
        assertEquals("Invalid input", vc.checkVowelOrConsonant('6'));
    }
}
