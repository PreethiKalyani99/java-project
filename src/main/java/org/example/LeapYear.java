package org.example;

public class LeapYear {
    public boolean isLeapYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        else return year % 400 == 0;
    }
}

