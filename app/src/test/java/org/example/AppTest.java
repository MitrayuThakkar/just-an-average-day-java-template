package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final int[] data = {1, 3, -2, 7, 0};
    private final int[] simpleData = {1, 2, 3, 4, 5};

    @Test
    public void testForLoopStats() {
        assertEquals(7, ForLoopStats.maximumUsingForLoop(data));
        assertEquals(-2, ForLoopStats.minimumUsingForLoop(data));
        assertEquals(9, ForLoopStats.sumUsingForLoop(data));
        assertEquals(9.0 / 5, ForLoopStats.averageUsingForLoop(data));
    }

    @Test
    public void testStreamStats() {
        assertEquals(7, StreamStats.maximumUsingStream(data));
        assertEquals(-2, StreamStats.minimumUsingStream(data));
        assertEquals(9, StreamStats.sumUsingStream(data));
        assertEquals(9.0 / 5, StreamStats.averageUsingStream(data));
    }

    @Test
    public void testAddOnStats() {
        assertArrayEquals(new int[]{2, 4}, AddOnStats.evensOnly(simpleData));
        assertArrayEquals(new int[]{1, 3, 5}, AddOnStats.oddsOnly(simpleData));
        assertArrayEquals(new int[]{6, 7, 8, 9, 10}, AddOnStats.addFive(simpleData));
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, AddOnStats.squareNumbers(simpleData));
    }
}


