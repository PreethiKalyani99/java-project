package org.example.array;

import java.util.Arrays;

public class ArrayManager {
    private int[] array;
    private int size;

    public ArrayManager() {
        array = new int[1];
        size = 0;
    }

    public void add(int el) {
        if(array.length == size) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = el;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, size);
    }

    public void remove(int el) {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        for (int i = 0; i < size; i++) {
            if(array[i] == el) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = 0;
                size--;
                return;
            }
        }
    }

    public boolean contains(int el) {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        for (int num: array) {
            if (num == el) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j+1]) {
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                }
            }
        }
    }

    public int search(int el) {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        for (int i = 0; i <= size; i++) {
            if(array[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        int max = 0;

        for (int num: array) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public int getMin() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void clear() {
        Arrays.fill(array, 0);
        size = 0;
    }

    public int size() {
        return size;
    }
}
