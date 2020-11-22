import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleCharTests {

    @Test
    public void DoubleCharEmpty() {
        assertEquals("", DebugExamples.doubleChar(""));
    }

    @Test
    public void DoubleCharOneChar() {
        assertEquals("aa", DebugExamples.doubleChar("a"));
    }

    @Test
    public void DoubleCharHello() {
        assertEquals("HHeelllloo", DebugExamples.doubleChar("Hello"));
    }
    
}
