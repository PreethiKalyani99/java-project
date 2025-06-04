package org.example.array;

public class SumOfArray {
    public int sumOfArray (int[] arr) {
       int sum = 0;

       for(int num: arr) {
           sum += num;
       }

       return sum;
    }
}
