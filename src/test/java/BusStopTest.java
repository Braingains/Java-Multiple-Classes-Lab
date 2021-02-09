import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Les Porter");
    }

    @Test
    public void hasName(){
        assertEquals("Les Porter", busStop.getName());
    }

    @Test
    public void hasQueue(){
        assertEquals(0, busStop.queueCount());
    }


}
