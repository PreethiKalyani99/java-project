package org.example;

import org.example.loops.Factorial;
import org.example.loops.MultiplicationTable;
import org.example.loops.ReverseANumber;
import org.example.loops.SumOfNumbers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReverseANumber f = new ReverseANumber();
        System.out.println(f.reverseANumber(1));
    }
}