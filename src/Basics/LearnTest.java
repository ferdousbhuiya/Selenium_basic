package Basics;

import org.junit.Assert;
import org.junit.Test;

public class LearnTest {
    int  doaddition(int num1, int num2)

    {
        return num1+num2;
    }
    int doMultiplication(int a, int b)
    {
        return a*b;
    }
    @Test
    public void testdoaddition()
    {
        LearnTest obj = new LearnTest();
        int nmm1=3;
        int num2=7;
        int expected = 10;
        //.assertEquals(10,doaddition(nmm1, num2));
        Assert.assertTrue(doaddition(nmm1,num2)==expected);
    }
}
