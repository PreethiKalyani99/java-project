package org.example;

public class Grade {
    String getGrade(int mark) {
        if (mark >= 90 && mark <= 100) {
            return "A";
        } else if (mark >= 80 && mark <= 89) {
            return "B";
        } else if (mark >= 70 && mark <= 79) {
            return "C";
        } else if (mark > 0 && mark < 70) {
            return "D";
        }
        return "Mark must be greater than 0 and less than or equal to 100.";
    }
}
