package delivery;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeliveryTest {
    private Delivery delivery;

    @Before
    public void setUpContext() {
        delivery = new Delivery();
    }

    @Test
    public void testReturns3() {
        assertEquals(3, delivery.returns3());
    }
}
