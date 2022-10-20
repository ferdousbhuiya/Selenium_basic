package UnitTesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParametrTestingTest {

// this is for parameterized test
    //By this parameterized test we can test number of tests at a time.

    @ParameterizedTest
    @ValueSource(ints = {46, 50, 900, 2000})
    void isEvenReturnTrue(int number)
    {
        assertTrue(ParametrTesting.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {33, 501, 9003, 20005, 67, 89074563})
    void isOddReturnFalse(int number)
    {
        assertFalse(ParametrTesting.isEven(number));
    }

}