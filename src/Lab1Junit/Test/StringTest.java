package Lab1Junit.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {
    @Test
    public void testLengthTrue()
    {
        String s = "JUnit Rules";
        assertTrue(11 == s.length());
        System.out.println(2);
    }

    @Test
    public void testLengthFalse()
    {
        String s = "JUnit Rules";
        assertFalse(1 == s.length());
        System.out.println(1);
    }

    @Test
    public void testSubStringTrue()
    {
        String s = "JUnit Rules";
        assertTrue(s.substring(0, 5).equals("JUnit"));
        System.out.println(3);
    }
    @Test
    public void testSubStringFalse()
    {
        String s = "JUnit Rules";
        assertFalse(s.substring(0, 4).equals("JUnit"));
        System.out.println(4);
    }
}

