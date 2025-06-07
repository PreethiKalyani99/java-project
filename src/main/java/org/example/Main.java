package org.example;

import org.example.linkedList.DoublyLinkedList;
import org.example.list.LinkedListManager;
import org.example.list.VectorManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VectorManager v = new VectorManager();
        v.add(1);
        v.add(4);
        v.add(2);
        v.add(16);
        v.add(8);

        v.addAtIndex(2, 30);
        v.removeByValue(4);
        System.out.println(v.getVector());
        System.out.println(v.get(2));
    }
}