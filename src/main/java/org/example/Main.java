package org.example;

import org.example.loops.SumOfNumbers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SumOfNumbers s = new SumOfNumbers();
        System.out.println(s.sumOfNaturalNumbers(5));
    }
}