import static org.junit.Assert.*;

import org.junit.Test;

public class RoughlyDoubledTests {

    @Test
    public void threeDoubled() {
        assertEquals(3, DebugExamples.roughlyDoubled(new int[] {1, 2, 3}, new int[] {2, 3, 7}));
    }

    @Test
    public void twoDoubled() {
        assertEquals(2, DebugExamples.roughlyDoubled(new int[] {1, 2, 3}, new int[] {2, 3, 9}));
    }

    @Test
    public void oneDoubled() {
        assertEquals(1, DebugExamples.roughlyDoubled(new int[] {1, 2, 3}, new int[] {7, 0, 5}));
    }

    @Test
    public void noDoubled() {
        assertEquals(0, DebugExamples.roughlyDoubled(new int[] {1, 2, 3}, new int[] {0, 2, 3}));
    }

}
