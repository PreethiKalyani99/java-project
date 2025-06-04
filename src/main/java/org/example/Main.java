package org.example;

import org.example.array.SumOfArray;
import org.example.loops.Factorial;
import org.example.loops.MultiplicationTable;
import org.example.loops.ReverseANumber;
import org.example.loops.SumOfNumbers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SumOfArray s = new SumOfArray();
        System.out.println(s.sumOfArray(new int[] {1, 2, 3, 5}));
    }
}