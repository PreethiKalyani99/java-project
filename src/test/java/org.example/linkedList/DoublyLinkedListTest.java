package org.example.linkedList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    DoublyLinkedList dl = new DoublyLinkedList();

    @Test
    void shouldAddElementsInList () {
        dl.add(4);
        dl.add(1);
        dl.add(13);
        dl.add(8);

        assertEquals(Arrays.asList(4,1,13,8), dl.getList());
    }

    @Test
    void shouldRemove4FromList () {
        dl.add(4);
        dl.add(1);
        dl.add(8);

        dl.remove(4);
        assertEquals(Arrays.asList(1,8), dl.getList());
    }

    @Test
    void shouldThrowErrorWhenElementNotFoundToRemove () {
        dl.add(4);
        dl.add(1);
        dl.add(8);

        Exception exception = assertThrows(NoSuchElementException.class, () -> dl.remove(2));

        assertEquals("Element not found", exception.getMessage());
    }

    @Test
    void shouldReturnTrueWhenValueIsFoundInList () {
        dl.add(4);
        dl.add(1);
        dl.add(8);

        assertTrue(dl.contains(1));
    }

    @Test
    void shouldClearTheElementsInList () {
        dl.add(4);
        dl.add(1);
        dl.add(8);

        dl.clear();
        assertEquals(List.of(), dl.getList());
    }

    @Test
    void shouldReverseTheListElements () {
        dl.add(4);
        dl.add(1);
        dl.add(8);

        dl.reverse();

        assertEquals(Arrays.asList(8,1,4), dl.getList());
    }
}
