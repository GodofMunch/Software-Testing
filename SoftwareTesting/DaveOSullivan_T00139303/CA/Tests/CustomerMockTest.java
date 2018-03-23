import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Customer.class)

public class CustomerMockTest {

    Customer testCustomer;

    @Before
    public void customerSetup() throws Exception {
        testCustomer = new Customer("Dave O'Sullivan");
    }

    @Test
    public void testLoan() throws Exception {
        Loan mockLoan = EasyMock.createMock(Loan.class);
        PowerMock.expectNew(Loan.class, 10000, 5).andReturn(mockLoan);
        expect(mockLoan.getRate()).andReturn(5.0);
        expect(mockLoan.getMonthlyPayment()).andReturn(118.71);
        expect(mockLoan.getTotalPayment()).andReturn(11322.74);
        PowerMock.replay(mockLoan, Loan.class);
        double expectedRate = mockLoan.getRate();
        double monthly = mockLoan.getMonthlyPayment();
        double total = mockLoan.getTotalPayment();

        assertEquals(5, expectedRate, 1);
        assertEquals(188.71, monthly, 1.005);
        assertEquals(11322.74, total, 1.005);

        PowerMock.verify(mockLoan, Loan.class);



    }


}