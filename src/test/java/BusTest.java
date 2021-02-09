import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

   private Bus bus;
   private Bus rickshaw;
   private Person person;


   @Before
    public void before(){
       bus = new Bus("Yoker", 16);
       rickshaw = new Bus("Yoker", 2);
       person = new Person("DeeDee");
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
       bus.addPassenger(person);
       assertEquals(1, bus.getPassengerCount());
   }

   @Test
    public void cannotAddBeyondCapacity(){
       rickshaw.addPassenger(person);
       rickshaw.addPassenger(person);
       assertEquals(false, rickshaw.addPassenger(person));

   }


}


