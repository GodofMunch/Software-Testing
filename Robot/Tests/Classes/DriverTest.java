package Classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class DriverTest {
    Driver myDriver = new Driver("Jack", 678);

    @Before
    public void DriverSetup() {
        myDriver = new Driver("Jack", 678);
    }
    @Test
    public void getDriverNum() throws Exception {
        Assert.assertEquals(678, myDriver.getDriverNum());
    }

    @Test
    public void getDriverName() throws Exception {
        Assert.assertEquals("Jack", myDriver.getDriverName());
    }

    @Test
    public void testToString() throws Exception {
        Assert.assertEquals("\nDriver Name: " + "Jack" + "\nDriver Number: " + 678, myDriver.toString());
    }

    @Test
    public void check_status() throws Exception {

        assertFalse(myDriver.check_status());
    }

    @Test (timeout = 1000)
    public void waitTillBanned() throws Exception {
        myDriver.waitTillbanned();
    }

}