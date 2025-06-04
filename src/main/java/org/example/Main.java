package org.example;

import org.example.array.RemoveDuplicates;
import org.example.array.SumOfArray;
import org.example.loops.Factorial;
import org.example.loops.MultiplicationTable;
import org.example.loops.ReverseANumber;
import org.example.loops.SumOfNumbers;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(Arrays.toString(rd.removeDuplicates(new int[] {1,3,5,3,5,2,6,8,1})));
    }
}