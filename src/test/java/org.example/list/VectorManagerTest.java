package org.example.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class VectorManagerTest {
    VectorManager v = new VectorManager();

    @Test
    void shouldAddElementsInList () {
        v.add(1);
        v.add(4);
        v.add(7);
        v.add(2);

        assertEquals(Arrays.asList(1,4,7,2), v.getVector());
    }

    @Test
    void shouldAdd8AtPosition2 () {
        v.add(1);
        v.add(4);
        v.add(7);
        v.add(2);

        v.addAtIndex(2,8);
        assertEquals(Arrays.asList(1,4,8,7,2), v.getVector());
    }

    @Test
    void shouldThrowErrorForInvalidIndex () {
        v.add(1);
        v.add(4);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> v.addAtIndex(3, 6));

        assertEquals("Invalid index: 3", exception.getMessage());
    }

    @Test
    void shouldUpdateSecondElementInList () {
        v.add(1);
        v.add(4);
        v.add(7);

        v.update(1, 6);
        assertEquals(Arrays.asList(1,6,7), v.getVector());
    }

    @Test
    void shouldRemove4FromTheList () {
        v.add(1);
        v.add(4);
        v.add(7);

        v.removeByValue(4);
        assertEquals(Arrays.asList(1,7), v.getVector());
    }

    @Test
    void shouldRemoveIndex2 () {
        v.add(1);
        v.add(4);
        v.add(7);

        v.removeAtIndex(2);
        assertEquals(Arrays.asList(1,4), v.getVector());
    }

    @Test
    void shouldReturnTrueWhenValueIsFoundInList () {
        v.add(1);
        v.add(4);
        v.add(7);

        assertTrue(v.contains(4));
    }

    @Test
    void shouldGetValueOfIndex2 () {
        v.add(1);
        v.add(4);
        v.add(7);

        assertEquals(7, v.get(2));
    }

    @Test
    void shouldReturnIndexOf4 () {
        v.add(1);
        v.add(4);
        v.add(7);

        assertEquals(1, v.indexOf(4));
    }

    @Test
    void shouldReturnIndexOfLastOccurrenceOf2() {
        v.add(1);
        v.add(2);
        v.add(7);
        v.add(2);
        v.add(8);

        assertEquals(3, v.lastIndexOf(2));
    }

    @Test
    void shouldReturnSizeOfList () {
        v.add(1);
        v.add(2);
        v.add(7);
        v.add(2);

        assertEquals(4, v.size());
    }

    @Test
    void shouldReturnTrueForEmptyList () {
        assertTrue(v.isEmpty());
    }

    @Test
    void shouldReturnFalseForNonEmptyList () {
        v.add(1);
        v.add(2);

        assertFalse(v.isEmpty());
    }

    @Test
    void shouldClearTheListElements () {
        v.add(1);
        v.add(2);

        v.clear();
        assertTrue(v.isEmpty());
    }
}
