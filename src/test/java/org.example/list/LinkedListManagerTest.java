package org.example.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListManagerTest {
    LinkedListManager ll = new LinkedListManager();

    @Test
    void shouldAddElementsInList () {
        ll.add(4);
        ll.add(1);
        ll.add(13);
        ll.add(8);

        assertEquals(Arrays.asList(4,1,13,8), ll.getList());
    }

    @Test
    void shouldAddElementAtFirstPosition () {
        ll.add(4);
        ll.add(1);

        ll.addFirst(16);

        assertEquals(Arrays.asList(16,4,1), ll.getList());
    }

    @Test
    void shouldAddElementAtLastPosition () {
        ll.add(4);
        ll.add(1);

        ll.addLast(3);

        assertEquals(Arrays.asList(4,1,3), ll.getList());
    }

    @Test
    void shouldAdd8AtPosition2 () {
        ll.add(4);
        ll.add(1);

        ll.addAtPosition(2, 8);

        assertEquals(Arrays.asList(4,1,8), ll.getList());

    }

    @Test
    void shouldThrowErrorWhenPositionIsGreaterThanListSize () {
        ll.add(4);
        ll.add(1);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> ll.addAtPosition(3, 8));

        assertEquals("Invalid index: 3", exception.getMessage());
    }

    @Test
    void shouldRemoveIndex2FromList () {
        ll.add(4);
        ll.add(1);
        ll.add(8);

        ll.remove(2);
        assertEquals(Arrays.asList(4,1), ll.getList());
    }

    @Test
    void shouldRemoveFirstElement () {
        ll.add(4);
        ll.add(1);
        ll.add(8);

        ll.removeFirst();
        assertEquals(Arrays.asList(1, 8), ll.getList());
    }

    @Test
    void shouldRemoveLastElement () {
        ll.add(4);
        ll.add(1);
        ll.add(8);

        ll.removeLast();
        assertEquals(Arrays.asList(4,1), ll.getList());
    }

    @Test
    void shouldReturnTrueWhenValueIsFoundInList () {
        ll.add(4);
        ll.add(1);
        ll.add(8);

        assertTrue(ll.contains(1));
    }

    @Test
    void shouldClearTheElementsInList () {
        ll.add(4);
        ll.add(1);
        ll.add(8);

        ll.clear();
        assertEquals(List.of(), ll.getList());
    }
}
