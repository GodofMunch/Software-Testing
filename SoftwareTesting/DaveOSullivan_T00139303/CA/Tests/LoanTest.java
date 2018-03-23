import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class LoanTest {

    private int nullValue;

    @Rule
    public Timeout timeoutClause = Timeout.millis(200);

    Loan newLoan;

    @Before
    public void setUpLoan() throws Exception{
         newLoan = new Loan(1234, 5);
    }
    @Test
    public void testGetAmount() throws Exception {
        assertEquals(1234, newLoan.getAmount(), 0);
    }

    @Test
    public void testGetPeriod() throws Exception {
        assertEquals(5, newLoan.getPeriod(),0 );
    }

    @Test
    public void testGetRate() throws Exception {
        assertEquals(6, newLoan.getRate(), 0);
    }

    @Test
    public void testGetMonthlyPayment() throws Exception {
        //Got answer from InterestCalculator Class, double checked on https://www.ccpc.ie/consumers/tools-and-calculators/loan-calculator/
        assertEquals(23.86, newLoan.getMonthlyPayment(), 0.005); //delta = .005 because we round cent up/down in that range
    }

    @Test
    public void testGetTotalPayment() throws Exception {
        assertEquals(1431.40, newLoan.getTotalPayment(), 0.005);
    }

    @Test
    public void testNoArgsConstructor() throws Exception {
        Loan noArgsConstructor = new Loan();
    }
    @Test
    public void testArgsConstructor() throws Exception {
        Loan argsConstructor = new Loan(5000, 3);
    }

    @Test
    public void testCaseOne() throws Exception {
        Loan testLoanOne = new Loan(500, 1);
        assertEquals(10, testLoanOne.getRate(), 0);
        assertEquals(43.96, testLoanOne.getMonthlyPayment(), 0.005);
        assertEquals(527.50, testLoanOne.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseTwo() throws Exception {
        Loan testLoanTwo = new Loan(501, 2);
        assertEquals(10, testLoanTwo.getRate(), 0);
        assertEquals(23.12, testLoanTwo.getMonthlyPayment(), 0.005);
        assertEquals(554.85, testLoanTwo.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseThree() throws Exception {
        Loan testLoanThree = new Loan(4999, 3);
        assertEquals(10, testLoanThree.getRate(), 0);
        assertEquals(161.30, testLoanThree.getMonthlyPayment(), 0.005);
        assertEquals(5806.93, testLoanThree.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseFour() throws Exception {
        Loan testLoanFour = new Loan(5000, 4);
        assertEquals(6,testLoanFour.getRate(), 0);
        assertEquals(117.43, testLoanFour.getMonthlyPayment(), 0.005);
        assertEquals(5636.41, testLoanFour.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseFive() throws Exception {
        Loan testLoanFive = new Loan(2500, 5);
        assertEquals(6, testLoanFive.getRate(), 0);
        assertEquals(48.33, testLoanFive.getMonthlyPayment(), 0.005);
        assertEquals(2899.92, testLoanFive.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseSix() throws Exception {
        Loan testLoanSix = new Loan(5001, 5);
        assertEquals(5, testLoanSix.getRate(), 0);
        assertEquals(94.38, testLoanSix.getMonthlyPayment(), 0.005);
        assertEquals(5662.50, testLoanSix.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseSeven() throws Exception {
        Loan testLoanSeven = new Loan(7500, 4);
        assertEquals(5, testLoanSeven.getRate(), 0);
        assertEquals(172.72, testLoanSeven.getMonthlyPayment(), 0.005);
        assertEquals(8290.55, testLoanSeven.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseEight() throws Exception {
        Loan testLoanEight = new Loan(9999, 1);
        assertEquals(8, testLoanEight.getRate(), 0);
        assertEquals(869.80, testLoanEight.getMonthlyPayment(), 0.005);
        assertEquals(10437.57, testLoanEight.getTotalPayment(), 0.005);
    }

    @Test
    public void testCaseNine() throws Exception {
        Loan testLoanNine = new Loan(10000, 2);
        assertEquals(8, testLoanNine.getRate(), 0);
        assertEquals(452.27, testLoanNine.getMonthlyPayment(), 0.005);
        assertEquals(10854.55, testLoanNine.getTotalPayment(), 0.005);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTen() throws Exception {
        Loan testLoanTen = new Loan(499, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseEleven() throws Exception {
        Loan testLoanEleven = new Loan (498, 4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwelve() throws  Exception {
        Loan testLoanTwelve = new Loan(0, 3);
    }


    @Test (expected = IllegalArgumentException.class)
    public void testCaseThirteen() throws  Exception {
        Loan testLoanThirteen = new Loan(nullValue, 5);
    }

/*



    }
*/
    @Test (expected = IllegalArgumentException.class)
    public void testCaseFifteen() throws Exception {
        Loan testLoanFifteen = new Loan(-501, 2);
    }
/*
    @Test (expected = IllegalArgumentException.class)
    public void testCaseSixteen() throws Exception {
        Loan testLoanSixteen = new Loan(2500, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseSeventeen() throws  Exception {
        Loan testLoanSeventeen = new Loan(5001, 6);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseEighteen() throws Exception {
        Loan testLoanEighteen = new Loan(9999, 7);
    }
*/
    @Test (expected = IllegalArgumentException.class)
    public void testCaseNineteen() throws Exception {
        Loan testLoanNineteen = new Loan(499, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwenty()throws Exception {
        Loan testLoanTwenty = new Loan(10001, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyOne() throws Exception {
        Loan testLoanTwentyOne = new Loan(10002, 4);
    }
/*
    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyTwo() throws Exception {
        Loan testLoanTwentyTwo = new Loan(7500, nullValue);
    }
/*
    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyThree() throws  Exception {
        Loan testLoanTwentyThree = new Loan(7500, T2);
    }
*/
/*
    @Test (expected = IllegalArgumentException.class)
    public void  testCaseTwentyFour() throws  Exception {
        Loan testLoanTwentyFour = new Loan(5000, -4);
    }
*/
    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyFive() throws Exception {
        Loan testLoanTwentyFive = new Loan(10001, 0);
    }
}