package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void cannotRideTooOld() {
        visitor1 = new Visitor(16, 123.5, 20.00);
        playground.isAllowedTo(visitor1);
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canRideNotTooOld() {
        visitor1 = new Visitor(15, 123.5, 20.00);
        playground.isAllowedTo(visitor1);
        assertEquals(1, playground.getVisitCount());
    }
}
