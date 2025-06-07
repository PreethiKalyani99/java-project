package org.example;

import org.example.linkedList.DoublyLinkedList;
import org.example.list.LinkedListManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedListManager ll = new LinkedListManager();
        ll.add(1);
        ll.add(4);
        ll.addFirst(5);
        ll.add(2);
        ll.addFirst(1);

        ll.addAtPosition(4, 50);

        ll.remove(3);
        System.out.println(ll.getList());
        System.out.println(ll.get(2));
    }
}