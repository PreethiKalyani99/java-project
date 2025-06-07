package org.example.list;


import java.util.LinkedList;
import java.util.List;

public class LinkedListManager {
    private final LinkedList<Integer> list = new LinkedList<>();

    public void add (int el) {
        list.add(el);
    }

    public void addAtPosition (int index, int el) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        list.add(index, el);
    }

    public void addFirst (int el) {
        list.addFirst(el);
    }

    public void addLast (int el) {
        list.addLast(el);
    }
    public void remove (int index) {
        list.remove(index);
    }

    public void removeFirst () {
        list.removeFirst();
    }

    public void removeLast () {
        list.removeLast();
    }

    public boolean contains (int el) {
        return list.contains(el);
    }

    public int get (int index) {
        return list.get(index);
    }

    public int size () {
        return list.size();
    }

    public void clear () {
        list.clear();
    }

    public List<Integer> getList () {
        return list;
    }

}
