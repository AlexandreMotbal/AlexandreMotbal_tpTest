package kata;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Ball b = new Ball();
        long startTime = System.currentTimeMillis();
        b.roll();
        long stopTime = System.currentTimeMillis();
        long duration = stopTime - startTime;

        long expectedTime = 20000;
        assertEquals(duration,expectedTime);

    }
}
