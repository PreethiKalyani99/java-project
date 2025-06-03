package org.example;

import org.example.loops.MultiplicationTable;
import org.example.loops.SumOfNumbers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        System.out.println(m.generateTable(5));
    }
}