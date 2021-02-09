import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

   private Bus bus;
   private Bus rickshaw;
   private Person person;
   private BusStop busStop;


   @Before
    public void before(){
       bus = new Bus("Yoker", 16);
       rickshaw = new Bus("Yoker", 2);
       person = new Person("DeeDee");
       busStop = new BusStop("Les Porter");
       busStop.addPersonToQueue(person);
       busStop.addPersonToQueue(person);
   }

   @Test
    public void hasDestination(){
       assertEquals("Yoker", bus.getDestination());
   }

   @Test
    public void hasCapacity(){
       assertEquals(16, bus.getCapacity());
   }


   @Test
    public void hasPassenger(){
       bus.addPassenger(busStop);
       assertEquals(1, bus.getPassengerCount());
   }

   @Test
    public void cannotAddBeyondCapacity(){
       rickshaw.addPassenger(busStop);
       rickshaw.addPassenger(busStop);
       assertEquals(false, rickshaw.addPassenger(busStop));

   }

   @Test
   public void canRemovePassenger(){
      rickshaw.addPassenger(busStop);
      rickshaw.removePassenger();
      assertEquals(0, bus.getPassengerCount());

   }

   @Test
   public void canPickUp(){

   }


}


