package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public ArrayList<Integer> removeDuplicates (List<Integer> arr) {
        ArrayList<Integer>  uniqueElements = new ArrayList<>();

        for (int el: arr) {
            if(!uniqueElements.contains(el)) {
                uniqueElements.add(el);
            }
        }
        return uniqueElements;
    }
}
