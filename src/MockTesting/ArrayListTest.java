package MockTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    @Test
    public void test()
    {
        ArrayList<Integer> mocklist = mock(ArrayList.class);
        expect(mocklist.add(15)).andReturn(true);
        expect(mocklist.add(10)).andReturn(true);
        expect(mocklist.size()).andReturn(2);
        expect(mocklist.get(0)).andReturn(15);
        replay(mocklist);

        mocklist.add(15);
        mocklist.add(10);

        assertTrue(mocklist.get(0)==10);
        assertEquals(mocklist.size(), 2);


    }
}
