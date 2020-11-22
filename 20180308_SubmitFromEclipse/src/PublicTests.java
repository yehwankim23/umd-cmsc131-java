import static org.junit.Assert.*;

import org.junit.Test;

public class PublicTests {

    @Test
    public void testAddTwoInts() {
        assertEquals(7, Functions.sumTwoInts(3, 4));
        assertEquals(0, Functions.sumTwoInts(3, -3));
    }

    @Test
    public void testDoubleArray() {
        assertArrayEquals(new int[] {0, 2, 4}, Functions.doubleArray(3));
        assertArrayEquals(new int[] {0, 2, 4, 6, 8}, Functions.doubleArray(5));
    }

    @Test
    public void testUnique2() {
        assertEquals(1, Functions.countUnique(1, 1));
        assertEquals(2, Functions.countUnique(1, 2));
    }

    @Test
    public void testUnique3() {
        assertEquals(1, Functions.countUnique(1, 1, 1));
    }

    @Test
    public void testCountFactors() {
        assertEquals(3, Functions.countFactors(6));
        assertEquals(5, Functions.countFactors(12));
    }
}
