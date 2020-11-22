import static org.junit.Assert.*;
import org.junit.Test;

public class PublicTests {

    @Test
    public void testFillLine3() {
        assertEquals(3, Recursions.fillLine1_2(3));
    }

    @Test
    public void testFillLine4() {
        assertEquals(5, Recursions.fillLine1_2(4));
    }

    @Test
    public void testFillLine5() {
        assertEquals(8, Recursions.fillLine1_2(5));
    }

    @Test
    public void testGroupSumTrues() {
        assertTrue(Recursions.subsetSum7(0, new int[] { 3, 5, 7, 4 }, 14));
        assertTrue(Recursions.subsetSum7(0, new int[] { 2, 5, 14, 4 }, 19));
        assertTrue(Recursions.subsetSum7(0, new int[] { 3, 5, 1 }, 9));
    }

    @Test
    public void testGroupSumFalses() {
        assertFalse(Recursions.subsetSum7(0, new int[] { 4, 7, 2 }, 10));
        assertFalse(Recursions.subsetSum7(0, new int[] { 9 }, 1));
    }

}
