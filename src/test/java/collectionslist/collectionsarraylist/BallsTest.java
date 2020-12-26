package collectionslist.collectionsarraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallsTest {

    @Test
    void testCreateBalls() {
        assertEquals(90, Balls.createBalls(90).size());
        assertEquals(45, Balls.createBalls(45).size());
    }

}