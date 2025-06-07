package org.example.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add (int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove (int value) {
         if (head == null) return;

         if (head.data == value) {
            if (head == tail) {
                head = tail = null;
            }
            else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return;
         }

         Node curNode = head;

         while (curNode != null && curNode.data != value) {
             curNode = curNode.next;
         }

        if (curNode == null) {
            throw new NoSuchElementException("Element not found");
        }

         if (curNode == tail) {
             tail = tail.prev;
             tail.next = null;
         }
         else{
             curNode.prev.next = curNode.next;
             curNode.next.prev = curNode.prev;
         }

         size--;
    }

    public boolean contains (int value) {
        Node curNode = head;

        while (curNode != null) {
            if (curNode.data == value) return true;
            curNode = curNode.next;
        }

        return false;
    }

    public void clear () {
        head = tail = null;
        size = 0;
    }

    public int size () {
        return size;
    }

    public void reverse () {
        if (head == null) throw new IllegalStateException("List is empty");

        Node curNode = head;
        Node temp = null;

        while (curNode != null) {
            temp = curNode.prev;
            curNode.prev = curNode.next;
            curNode.next = temp;
            curNode = curNode.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public List<Integer> getList () {
        List<Integer> result  = new ArrayList<>();
        Node curNode = head;

        while (curNode != null) {
            result.add(curNode.data);
            curNode = curNode.next;
        }
        return result;
    }
}
