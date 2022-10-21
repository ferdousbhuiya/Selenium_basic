package Advance_TestNG_Framework;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[3][2];

        data[0][0] = "mngr449730";
        data[0][1] = "apYguna";

        data[1][0] = "mngr449730";
        data[1][1] = "apYguna";

        data[2][0] = "mngr449730";
        data[2][1] = "apYguna";

        return data;
    }
}
