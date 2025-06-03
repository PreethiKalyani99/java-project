package org.example.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTableTest {
    private final MultiplicationTable mt = new MultiplicationTable();

    @Test
    @DisplayName("Should return multiplication table up to 3 for input 3")
    void test () {
        String result = mt.generateTable(3);
        assertTrue(result.contains("2 * 5 = 10"));
        assertTrue(result.contains("3 * 6 = 18"));
        assertFalse(result.contains("4 * 1 = 4"));
    }
}
