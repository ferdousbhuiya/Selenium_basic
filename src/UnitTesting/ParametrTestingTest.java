package UnitTesting;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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


    // parameterized method for multiple input
    @ParameterizedTest
    @MethodSource("setupData")
    void testWithmethodSource(double x, double y, double expected)
    {
        assertThat(ParametrTesting.calculator(x, y), equalTo(expected));
    }
static Stream<Arguments>setupData(){
        return Stream.of(
                Arguments.of(4.0, 3.0, 7.0),
                Arguments.of(34.0, 3.0, 37.0),
                Arguments.of(44.0, 3.0, 47.0),
                Arguments.of(49.0, 3.0, 52.0)
        );
}
    @Test
    void testEncrypt()
    {
    String expected = "Khoor#Zruog";
    String actual = ParametrTesting.encrypt("Hello World");
    assertEquals(expected, actual);
    }

    @Test
    void testDecrypt()
    {
        String expected = "Hello World";
        String actual = ParametrTesting.decrypt("Khoor#Zruog");
        assertEquals(expected, actual);
    }

    @Test
    void testEnct()
    {
        assertAll(() -> assertEquals("Khoor#Zruog", ParametrTesting.encrypt("Hello World")),
        () -> assertEquals("d", ParametrTesting.encrypt("a")),
                ()-> assertTrue(false),
                ()-> assertTrue(true),
                () -> assertSame(11,12)
                );
    }
    @Test
    void testdrct()
    {
        assertAll(()-> assertEquals("Hello World", ParametrTesting.decrypt("Khoor#Zruog")),
                ()-> assertEquals("WrIte ThIs GRoss", ParametrTesting.decrypt("ZuLwh#wkLv#JUrVv")),
                ()-> assertNotEquals("d", ParametrTesting.decrypt("d")));

    }

}

//For Parameterized testing we can use the website as below:
/*
JUnit 5 Parameterized Tests
https://www.baeldung.com/parameterized-tests-junit-5
Grouped Assertions
https://www.javaguides.net/2018/09/junit-5-assertall-example.html



 */