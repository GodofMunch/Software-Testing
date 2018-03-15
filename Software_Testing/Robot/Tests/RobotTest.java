import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;



public class RobotTest {
    Robot myRobot = new Robot("Buddy");

    @Rule
    public Timeout globalTimeOut = Timeout.millis(1000);

    @Before
    public void RobotSetUp() throws Exception {
        Robot myRobot = new Robot("Buddy");
    }

    @Test
    public void testRobotConstructor() throws Exception {


        assertEquals("Buddy", myRobot.getName());
    }

    @Test
    public void testIsNotWorking() throws Exception {
        assertFalse(myRobot.isWorking());
    }

    @Test
    public void testIsWorking() throws Exception {

        myRobot.talkToRobot();
        assertTrue(myRobot.isWorking());
    }

    @Test
    public void testGetIsWorkingMessage() throws Exception {
        myRobot.talkToRobot();
        assertEquals("I am Working", myRobot.getWorkingMessage());
    }

    @Test (expected = IllegalStateException.class)
    public void testGetWorkingMessageFail() throws Exception {
        assertEquals("I am Working", myRobot.getWorkingMessage());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConstructorFail() throws Exception {

        Robot newRobot = new Robot("");
        assertEquals("Buddy", newRobot.getName());
    }

    @Test (timeout = 1000) //milliseconds
    public void waitUntilWorkingTest() throws Exception {
        myRobot.waitUntilWorking();
    }
}