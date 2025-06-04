package org.example.array;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    private final RemoveDuplicates r = new RemoveDuplicates();

    @Test
    void shouldRemoveDuplicateElementFromArray () {
       assertEquals("[2, 5, 3, 1, 6, 8]", Arrays.toString(r.removeDuplicates(new int[] {2,2,5,3,1,5,6,8,3})));
    }

    @Test
    void shouldReturnEmptyArrayForEmptyInput () {
        assertEquals("[]", Arrays.toString(r.removeDuplicates(new int[] {})));
    }
}
