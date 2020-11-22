import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

    @Test
    public void testUnique3() {
        assertEquals(3, Functions.countUnique(1, 2, 3));
    }
}
