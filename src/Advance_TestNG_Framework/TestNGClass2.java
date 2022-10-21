package Advance_TestNG_Framework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.*;

public class TestNGClass2 {

   /* @BeforeSuite
    public void beforeAsuit()
    {
        System.out.println("Before a test suite");
    }*/
    /*@AfterSuite
    public void afterASuit()
    {
        System.out.println("After a test suite");
    }*/
    /*@BeforeTest
    public void beforeTestRun()
    {
        System.out.println("Before a test run");
    }
    @AfterTest
    public void afterTestRun()
    {
        System.out.println("After a test run");
    }*/

    @BeforeClass
    public static void beforeAClass()
    {
        System.out.println("Class-2, First method is this class, for Before Class");
    }
    @AfterClass
    public static void afterClass()
    {
        System.out.println("Class-2, Last test method in this class, for After Class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("\t Before a test method, for Before Method");

    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println(" \t Class-2, After a test method, for After Method");
    }
    @Test
    public void testCase1()
    {
        System.out.println("\t\t Class-2, Test case 1");

    }
    @Test
    public void testCase2()
    {
        System.out.println("\t\t Class-2, Test case 2");
    }


}
