package MockTesting;

import org.easymock.EasyMock;
import org.easymock.IMockBuilder;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationTest {
    @Test
    public void test()
    {
       IFeeProvider feeProvider = createMock(IFeeProvider.class);
        IMockBuilder<Student>builder = EasyMock.createMockBuilder(Student.class);
        Student student = builder.createMock();
        StudentRegistration studentRegistration = new StudentRegistration(student, feeProvider);



        feeProvider.setFee(100.00);
        expect(feeProvider.feesDue()).andReturn(100.00);
        feeProvider.payFee(75.00);
        expect(feeProvider.feesDue()).andReturn(25.00);
        replay(feeProvider);


        assertEquals(studentRegistration.setFee(100.00), "fee set");
        assertEquals(studentRegistration.feesDue(), 100.00, 0.001);
        assertEquals(studentRegistration.payFee(75.00), "fee payment");
        assertEquals(studentRegistration.feesDue(), 25.00, 0.001);

        EasyMock.verify(feeProvider);
    }

}