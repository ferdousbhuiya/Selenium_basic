package Advance_TestNG_Framework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.*;

public class TestNGClass1 {

    @BeforeSuite
    public void beforeAsuit()
    {
        System.out.println("Before a test suite");
    }
    @AfterSuite
    public void afterASuit()
    {
        System.out.println("After a test suite");
    }
    @BeforeTest
    public void beforeTestRun()
    {
        System.out.println("Before a test run");
    }
    @AfterTest
    public void afterTestRun()
    {
        System.out.println("After a test run");
    }

    @BeforeClass
    public static void beforeAClass()
    {
        System.out.println("First method is this class");
    }
    @AfterClass
    public static void afterClass()
        {
            System.out.println("Last test method in this class");
        }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("\t Before a test method");

    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println(" \t After a test method");
    }
    @Test
    public void testCase1()
    {
        System.out.println("\t\t Test case 1");

    }
    @Test
    public void testCase2()
    {
        System.out.println("\t\t Test case 2");
    }

}
