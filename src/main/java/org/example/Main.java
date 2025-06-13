package org.example;

import org.example.linkedList.DoublyLinkedList;
import org.example.list.LinkedListManager;
import org.example.list.VectorManager;
import org.example.properties.PropertiesTryOut;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PropertiesTryOut p = new PropertiesTryOut();

        p.setProperty("a", "apple");
        p.setProperty("b", "ball");
        p.setProperty("c", "cat");
        p.setProperty("d", "dog");
        p.setProperty("e", "elephant");
        p.setProperty("f", "flight");

        System.out.println(p.getProperty("d"));

        p.printProperties();
    }
}