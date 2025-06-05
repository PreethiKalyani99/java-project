package org.example;

import org.example.array.SumOfArray;
import org.example.list.ArrayManager;
import org.example.list.RemoveDuplicates;
import org.example.loops.Factorial;
import org.example.loops.MultiplicationTable;
import org.example.loops.ReverseANumber;
import org.example.loops.SumOfNumbers;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayManager a = new ArrayManager();
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(2);
        a.add(1);

        a.remove(4);

        System.out.println(a.getArray());
    }
}