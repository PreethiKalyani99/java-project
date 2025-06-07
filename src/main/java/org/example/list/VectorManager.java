package org.example.list;

import java.util.Vector;

public class VectorManager {
    private final Vector<Integer> vector = new Vector<>();

    public void add (int val) {
        vector.add(val);
    }

    public void addAtIndex (int index, int val) {
        if(index < 0 || index > vector.size()) throw new IndexOutOfBoundsException("Invalid index: " + index);

        vector.add(index, val);
    }

    public void update (int index, int val) {
        vector.set(index, val);
    }

    public void removeByValue (int val) {
        vector.remove(Integer.valueOf(val));
    }

    public void removeAtIndex (int index) {
        vector.remove(index);
    }

    public boolean contains (int val) {
        return vector.contains(val);
    }

    public int get (int index) {
        return vector.get(index);
    }

    public int indexOf(int val) {
        return vector.indexOf(val);
    }

    public int lastIndexOf(int val) {
        return vector.lastIndexOf(val);
    }

    public int size () {
        return vector.size();
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }

    public void clear () {
        vector.clear();
    }

    public Vector<Integer> getVector () {
        return vector;
    }
}
