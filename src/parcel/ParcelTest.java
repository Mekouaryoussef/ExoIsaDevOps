package parcel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParcelTest {

    private Parcel parcel;

    @Before
    public void setUpContext() {
        parcel = new Parcel();
    }

    @Test
    public void testReturns1() {
        assertEquals(1, parcel.returns1());
    }

}
