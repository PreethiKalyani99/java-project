package org.example.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManagerTest {
    ArrayManager am = new ArrayManager();

    @Test
    void shouldAddElementToArray () {
        am.add(7);
        am.add(1);
        am.add(2);
        am.add(5);
        am.add(3);
        am.add(4);

        assertEquals(Arrays.asList(7,1,2,5,3,4), am.getArray());
    }

    @Test
    void shouldRemoveGivenNumberFromArray () {
        am.add(7);
        am.add(1);
        am.add(2);
        am.add(5);
        am.add(3);
        am.add(4);
        am.remove(3);

        assertEquals(Arrays.asList(7,1,2,5,4), am.getArray());
    }

    @Test
    void shouldReturnTrueIfArrayHasTheGivenInput () {
        am.add(2);
        am.add(5);
        am.add(3);
        assertTrue(am.contains(2));
    }

    @Test
    void shouldUpdateArrayElement () {
        am.add(2);
        am.add(5);
        am.add(3);

        am.update(1, 7);
        assertEquals(Arrays.asList(2,7,3), am.getArray());
    }

    @Test
    void shouldReturnFalseIfArrayDoesNotContainGivenInput () {
        am.add(2);
        am.add(5);
        am.add(3);
        assertFalse(am.contains(4));
    }

    @Test
    void shouldSortArrayInAscOrder () {
        am.add(7);
        am.add(1);
        am.add(2);
        am.add(5);
        am.add(4);

        am.sort();

        assertEquals(Arrays.asList(1,2,4,5,7), am.getArray());
    }

    @Test
    void shouldReturnTheIndexOfInputElement () {
        am.add(7);
        am.add(9);
        am.add(2);

        assertEquals(1, am.search(9));
    }

    @Test
    void shouldReturnMaxElementInArray () {
        am.add(7);
        am.add(9);
        am.add(2);

        assertEquals(9, am.getMax());
    }

    @Test
    void shouldReturnMinElementInArray () {
        am.add(7);
        am.add(9);
        am.add(2);

        assertEquals(2, am.getMin());
    }

    @Test
    void shouldClearArray () {
        am.clear();

        assertEquals(0, am.size());
    }

    @Test
    void shouldThrowErrorIfRemoveElementInEmptyArray () {
       Exception exception = assertThrows(IllegalStateException.class, () -> {
           am.remove(4);
       });

        assertEquals("List is empty", exception.getMessage());
    }
}

