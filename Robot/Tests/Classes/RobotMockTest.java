package Classes;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;



import static junit.framework.TestCase.assertEquals;
import static org.easymock.EasyMock.expect;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Robot.class)
public class RobotMockTest {

    public class RobotOwnerTest {
        @Test
        public void testOwner() throws Exception {
            System.out.println("in test");
            Robot buddy = new Robot("buddy", 1);

        /*call the createMock to create a mock for the Owner class */
            Owner mockOwner = EasyMock.createMock(Owner.class);

        /* Tell PowerMock to intercept any new call and return mockOwner */
            PowerMock.expectNew(Owner.class, "John Smith", 10000.00).andReturn(mockOwner);

        /* set up the expected values and return values */
            expect(mockOwner.getMonthlyPayments()).andReturn(833.33);

        /*activate the mock */
            PowerMock.replay(mockOwner, Owner.class);

            double expResult = 833.33;
            double result = buddy.recordOwnerAndMonthlyPayments("John Smith");
            assertEquals(expResult, result, 0.05);
        /* verify that PowerMock was called and used */
            PowerMock.verify(mockOwner, Owner.class);
        }
    }

    public class RobotEngineerTest {
        @Test
        public void testEngineer() throws Exception {
            System.out.println("engineer test");

            Robot myRobot = new Robot("Dave", 28);

            Engineer mockEngineer = EasyMock.createMock(Engineer.class);

            PowerMock.expectNew(Engineer.class, "Maire Deane", 79567085).andReturn(mockEngineer);

            //expect(mockEngineer.)
        }
    }
}




