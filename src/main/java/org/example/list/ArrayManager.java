package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayManager {
    private final ArrayList<Integer> list;

    public ArrayManager() {
        list = new ArrayList<>();
    }

    public void add (int el) {
        list.add(el);
    }

    public void update (int index, int val) {
        if(index < 0 || index > list.size()) throw new IndexOutOfBoundsException("Index does not exist");

        list.set(index, val);
    }
    public void remove (int el) {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

//        list.remove(el); // remove element at the position
        list.remove(Integer.valueOf(el)); // remove the actual element
    }

    public boolean contains (int el) {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

        return list.contains(el);
    }

    public void sort () {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

        Collections.sort(list);
    }

    public int search (int el) {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

        return list.indexOf(el);
    }

    public int getMax () {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

        return Collections.max(list);
    }

    public int getMin () {
        if (list.isEmpty()) throw new IllegalStateException("List is empty");

        return Collections.min(list);
    }

    public void clear () {
        list.clear();
    }

    public int size () {
        return list.size();
    }

    public ArrayList<Integer> getArray () {
        return list;
    }
}
