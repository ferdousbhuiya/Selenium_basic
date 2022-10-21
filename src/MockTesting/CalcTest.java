package MockTesting;

import org.junit.jupiter.api.Test;
import org.easymock.EasyMock;

import static org.easymock.EasyMock.expect;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
public class CalcTest {
    @Test
    public void test() {
        //Create mock object
        ICalc calc = EasyMock.createMock(ICalc.class);
        //Feed it to the business object
        MathUtils mathUtils = new MathUtils(calc);





        expect(Calc.add(1, 1)).andReturn(2);
        expect(Calc.multply(10,10)).andReturn(100);
        Calc.reset();
        reply(calc);

        assertEquals(Calc.add(1,1),2);
        assertEquals(Calc.multiply(10, 10), 100);
        assertEquals("calc reset", Calc.reset());


        EasyMock.verify(calc);
/*

Reading Resources
EasyMock
https://easymock.org/user-guide.html

Mockito Vs EasyMock
https://www.javatpoint.com/mockito-vs-easymock



Reading Resource
Types of Mocks
https://www.journaldev.com/22234/easymock-nice-strict-mock#:~
:text=EasyMock%20mock%20objects%20can%20have,%E2%80%93%20default%2C%20strict%20and%20nice.
 */






/*


    }

}
*/