package MockTesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostCalcTest {
private static Student stu1;
private static CostCalc calc;

@BeforeAll
    static void setUp()
{
    stu1 = new Student("George Frank", 24,3, true, 4);
    calc = new CostCalc();

}
@Test
    void calcCostTest()
{
    int expected = 550;
    int actual = calc.calcCost(stu1);
    //assertThat(calc.calcCost(stu1),is(550));
    assertEquals(expected, actual);
}
@Test
    void weeksCostTest()
{
    int expected = 2000;
    int actual = calc.weeksCost(12);
    assertEquals(expected, actual);
}
@Test
    void residentTest()
{
    int expected = 70;
    int actual = calc.residentCost(700,false);
    assertEquals(expected, actual);
}
    @Test
    void yearsDisTest()
    {
        int expected = 150;
        int actual = calc.yearsDiscount(3);
        assertEquals(expected, actual);
    }

}


/*

TDD
Explaining TDD
https://juristr.com/blog/2010/10/test-driven-development-and-automated/
https://martinfowler.com/bliki/TestDrivenDevelopment.html
https://www.barbarianmeetscoding.com/blog/learning-test-driven-development-with-kent-beck

 TDD Metaphors
How to Explain TDD
https://medium.com/@dagmaraszkurat/how-i-explained-tdd-to-a-non-developer-friend-and-got-a-job-offer-over-tacos-b881895182c5
TDD Metaphor
https://juristr.com/blog/2010/10/test-driven-development-and-automated/


 */