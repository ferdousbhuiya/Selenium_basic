package UnitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CourseJavaTest

{
    @Test
    void sucessfulDivision()
    {
        var result1 = new CourseJava();
        int validNumOne = 6;
        int validNumTwo = 2;
        int result = result1.division(validNumOne, validNumTwo);
        assertEquals(3, result);
    }
    @Test
    void varifica ()
    {
        var result1 = new CourseJava();
        assertEquals(4, result1.division(24, 6));
    }
    @Test
    void varific ()
    {
        var result1 = new CourseJava();
        assertNotEquals(5, result1.division(6, 7));
    }
    @Test
    void nameCheck()
    {
        String name = "Babul";
        assertEquals(name, "Babul");
    }

    @Test
    void wordTest()
    {
        assertTrue(CourseJava.isEmpty(null));
        assertTrue(CourseJava.isEmpty(""));
        assertFalse(CourseJava.isEmpty("Ba"));
        assertFalse(CourseJava.isEmpty(" "));
    }

    @Test
            void wordTest1()
    {
        assertNull(CourseJava.isEmpty1(null));
        assertNull(CourseJava.isEmpty1(""));
        assertNotNull(CourseJava.isEmpty1("Ba"));
        assertNotNull(CourseJava.isEmpty1(" "));
    }

    // Using the Array's equality.
    @Test
    void arrayEqualsExample()
    {
        final int [] actualArray = {3,2,1};
        final int [] expextedArray = {1,2,3};
        Arrays.sort(actualArray); //Sorting the arrays in order
        assertArrayEquals(expextedArray,actualArray);
    }




}