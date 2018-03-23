import org.junit.Test;

public class LoanNegativeTests {

    private int nullValue;

    @Test (expected = IllegalArgumentException.class)
    public void testCaseFourteen() throws  Exception {
    //    Loan testLoanFourteen = new Loan(23T, 1);
    }

    @Test(expected = IllegalArgumentException.class)
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

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyTwo() throws Exception {
        Loan testLoanTwentyTwo = new Loan(7500, nullValue);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCaseTwentyThree() throws  Exception {
    //    Loan testLoanTwentyThree = new Loan(7500, T2);
    }
    @Test (expected = IllegalArgumentException.class)
    public void  testCaseTwentyFour() throws  Exception {
        Loan testLoanTwentyFour = new Loan(5000, -4);
    }
}
