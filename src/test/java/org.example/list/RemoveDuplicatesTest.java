package org.example.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    RemoveDuplicates rd = new RemoveDuplicates();

    @Test
    void shouldReturnUniqueElementsForIntegerArray () {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 4, 4));
        assertEquals(Arrays.asList(3, 1, 2, 4), rd.removeDuplicates(input));
    }

    @Test
    void shouldReturnEmptyArrayForEmptyInput () {
        List<Integer> input = new ArrayList<>();
        assertEquals(List.of(), rd.removeDuplicates(input));
    }
}
