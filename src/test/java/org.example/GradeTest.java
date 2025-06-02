package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {
    private final Grade grade = new Grade();


    @Test
    @DisplayName("Returns A for marks between 90 and 100")
    void testGradeA () {
        assertEquals("A", grade.getGrade(93));
    }

    @Test
    @DisplayName("Returns B for marks between 80 and 89")
    void testGradeB () {
        assertEquals("B", grade.getGrade(85));
    }

    @Test
    @DisplayName("Returns C for marks between 70 and 79")
    void testGradeC () {
        assertEquals("C", grade.getGrade(70));
    }

    @Test
    @DisplayName("Returns D for marks below 70")
    void testGradeD () {
        assertEquals("D", grade.getGrade(50));
    }

    @Test
    @DisplayName("Returns 'Mark must be greater than 0 and less than or equal to 100.' for invalid marks")
    void testInvalidInput () {
        assertEquals("Mark must be greater than 0 and less than or equal to 100.", grade.getGrade(120));
    }
}
