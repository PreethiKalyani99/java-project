package org.example.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManagerTest {
    ArrayManager am = new ArrayManager();
    int[] array = {7, 1, 2, 5, 3};


    @Test
    void shouldAddElementToArray () {
        am.add(7);
        am.add(1);
        am.add(2);
        am.add(5);
        am.add(3);
        am.add(4);
        int[] expectedResult = {7,1,2,5,3,4};
        assertArrayEquals(expectedResult, am.getArray());
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
        int[] expectedResult = {7,1,2,5,4};
        assertArrayEquals(expectedResult, am.getArray());
    }

    @Test
    void shouldReturnTrueIfArrayHasTheGivenInput () {
        am.add(2);
        am.add(5);
        am.add(3);
        assertTrue(am.contains(2));
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
        int[] expectedResult = {1,2,4,5,7};
        am.sort();
        assertArrayEquals(expectedResult, am.getArray());
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
}