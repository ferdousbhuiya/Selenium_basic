package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineLetterGradeTest {
    @Test
    void fiftyNineShouldReturF()
    {
        var grades = new DetermineLetterGrade();
        assertEquals('F', grades.grade(59));
    }
    @Test
    void sixtyNineShouldReturD()
    {
        var grades = new DetermineLetterGrade();
        assertEquals('D', grades.grade(69));
    }
    @Test
    void sevenNineShouldReturC()
    {
        var grades = new DetermineLetterGrade();
        assertEquals('C', grades.grade(79));
    }
    @Test
    void eightyShouldReturB()
    {
        var grades = new DetermineLetterGrade();
        assertEquals('B', grades.grade(80));
    }
    @Test
    void ninetyNineShouldReturA()
    {
        var grades = new DetermineLetterGrade();
        assertEquals('A', grades.grade(99));
    }
    @Test
    void negativeshouldreturnException()
    {

        var grades = new DetermineLetterGrade();
        assertThrows(IllegalArgumentException.class, () -> grades.grade(-1));

    }


}