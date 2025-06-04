package org.example.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public int[] removeDuplicates (int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int el : arr) {
            if (!isElementExist(temp, index, el)) {
                temp[index++] = el;
            }
        }
        return Arrays.copyOf(temp, index);
    }

    private boolean isElementExist (int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if(arr[i] == value) return true;
        }
        return false;
    }
}
