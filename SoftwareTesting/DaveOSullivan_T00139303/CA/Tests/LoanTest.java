import org.junit.Test;

import static org.junit.Assert.*;

public class LoanTest {
    @Test
    public void getAmount() throws Exception {
        Loan newLoan = new Loan(5555, 2);
        assertEquals(5555, newLoan.getAmount(), 0);
    }

    @Test
    public void getPeriod() throws Exception {
        Loan newLoan = new Loan(501, 3);
        assertEquals(3, newLoan.getPeriod(),0 );
    }

    @Test
    public void getRate() throws Exception {

        Loan newLoan = new Loan(2000, 4);
        assertEquals(6, newLoan.getRate(), 0);

    }

    @Test
    public void getMonthlyPayment() throws Exception {
        Loan newLoan = new Loan(2000,4);
        assertEquals(46.97, newLoan.getMonthlyPayment(), 0.005);
    }

    @Test
    public void getTotalPayment() throws Exception {
        Loan newLoan = new Loan(2000,4);
        assertEquals(2254.56, newLoan.getTotalPayment(), 0.005);
    }

    @Test
    public void testNoArgsConstructor() throws Exception {
        Loan noArgsConstructor = new Loan();
    }
    @Test
    public void testArgsConstructor() throws Exception {
        Loan argsConstructor = new Loan(5000, 3);
    }
}