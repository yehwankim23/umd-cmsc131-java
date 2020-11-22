import static org.junit.Assert.*;

import org.junit.Test;

public class XyzMiddleTests {
    @Test
    public void noXYZ() {
        assertFalse(DebugExamples.xyzMiddle("abcdef"));
    }

    @Test
    public void xyzAtFirst() {
        assertFalse(DebugExamples.xyzMiddle("xyzabcdef"));
    }

    @Test
    public void xyzAtLast() {
        assertFalse(DebugExamples.xyzMiddle("abcdefxyz"));
    }

    @Test
    public void xyzAtMiddle() {
        assertTrue(DebugExamples.xyzMiddle("abcdxyzkwi"));
    }
    
    @Test
    public void xyzTwice() {
        assertTrue(DebugExamples.xyzMiddle("xyzaxyzani"));
    }
    
    @Test
    public void xyzTriple() {
        assertTrue(DebugExamples.xyzMiddle("xyzAxyzBxyz"));
    }
    
    @Test
    public void xyzOddTimes() {
        assertTrue(DebugExamples.xyzMiddle("xyzxyzxyz"));
    }
    
    @Test
    public void xyzEvenTimes() {
        assertFalse(DebugExamples.xyzMiddle("xyzxyzxyzxyz"));
    }
    
    @Test
    public void xyzEmptyStr() {
        assertFalse(DebugExamples.xyzMiddle(""));
    }

    @Test
    public void xyzManyTimes() {
        assertFalse(DebugExamples.xyzMiddle("xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz"));
    }
    
    
}

