package org.example;

import org.example.linkedList.DoublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(2);
        ll.add(1);

        ll.remove(5);
        System.out.println(ll.getList());

        ll.reverse();
        System.out.println(ll.getList());
    }
}