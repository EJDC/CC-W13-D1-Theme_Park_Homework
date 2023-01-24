package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void cannotBuyTooYoung() {
        visitor = new Visitor(17, 123.5, 20.00);
        assertEquals("No bacci for you!",  tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void canBuyOldEnough() {
        visitor = new Visitor(18, 123.5, 20.00);
        assertEquals("Welcome you may purchase!",    tobaccoStall.isAllowedTo(visitor));
    }
}


