import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Les Porter");
        person = new Person("Deedee");
    }

    @Test
    public void hasName(){
        assertEquals("Les Porter", busStop.getName());
    }

    @Test
    public void hasQueue(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
    }



}
