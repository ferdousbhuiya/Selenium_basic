package UnitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        //assertEquals(4, simpleCalculator.add(2,2));
        assertTrue(simpleCalculator.add(2, 2)==4);
    }

    // For the testing of a single case we can use multiple test cases with different parameters. In that case we can simply copy
    //and paste the method and rename it.
    @Test
    public void add1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(15, simpleCalculator.add(6,9));
        //(simpleCalculator.add(6, 9)==15);
    }
}