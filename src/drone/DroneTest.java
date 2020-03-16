package drone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DroneTest {
    private Drone drone;

    @Before
    public void setUpContext() {
        drone = new Drone();
    }

    @Test
    public void testReturns2() {
        assertEquals(2, drone.returns2());
    }
}
