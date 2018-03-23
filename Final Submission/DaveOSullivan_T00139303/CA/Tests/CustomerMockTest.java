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
        PowerMock.expectNew(Loan.class, 5000.00, 5).andReturn(mockLoan);
        expect(mockLoan.getMonthlyPayment()).andReturn(96.66);
        PowerMock.replay(mockLoan, Loan.class);
        testCustomer.takeoutloan();
        assertEquals(96.66, testCustomer.getMonthlypayments(), 0.005);
        assertEquals("Dave O'Sullivan", testCustomer.getName());
        //assertEquals(5000.00, );

        PowerMock.verify(mockLoan, Loan.class);



    }


}