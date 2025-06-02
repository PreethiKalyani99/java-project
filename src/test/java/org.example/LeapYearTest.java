package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    private final LeapYear leapYear = new LeapYear();

    @Test
    @DisplayName("1900 is not a leap year")
    void test1 () {
        assertFalse(leapYear.isLeapYear(1900));
    }

    @Test
    @DisplayName("2024 is leap year")
    void test2 () {
        assertTrue(leapYear.isLeapYear(2024));
    }
}