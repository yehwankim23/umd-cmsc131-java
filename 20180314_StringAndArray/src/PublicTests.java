import static org.junit.Assert.*;

import org.junit.Test;

public class PublicTests {

    @Test
    public void testConCat() {
        assertEquals("abcxyz", Problems.conCat("abc", "xyz"));
        assertEquals("abc", Problems.conCat("abc", ""));
        assertEquals("hibye", Problems.conCat("hi", "bye"));
        assertEquals("dogcat", Problems.conCat("dog", "cat"));
        assertEquals("applemu", Problems.conCat("apple", "emu"));
        assertEquals("skillime", Problems.conCat("skill", "lime"));
    }

    @Test
    public void testChipotleOrder() {
        assertEquals("Bowl with brown rice and a lot of fajita veggies and pico salsa.", 
                Problems.chipotleOrder('b', 10, 1, false));
        assertEquals("Bowl with white rice and no fajita veggies and corn salsa. Guac please.", 
                Problems.chipotleOrder('W', 0, 3, true));
        assertEquals("Bowl with white rice and some fajita veggies and verde salsa.", 
                Problems.chipotleOrder('w', 5, 2, false));
        assertEquals("Bowl with brown rice and a lot of fajita veggies and verde salsa. Guac please.", 
                Problems.chipotleOrder('B', 10, 2, true));
    }

    @Test
    public void testCountCode()
    {
        assertEquals(1, Problems.countCode("code"));
        assertEquals(0, Problems.countCode("codingbat"));
        assertEquals(1, Problems.countCode("hour of code"));
        assertEquals(2, Problems.countCode("I coded during the hour of code"));
        assertEquals(5, Problems.countCode("I <3 code. Code good. I codeveloped code with my codesigner."));
    }

    @Test
    public void testDouble23()
    {
        assertTrue(Problems.double23(new int[] {2, 2, 3, 3}));
        assertTrue(Problems.double23(new int[] {2, 2, 3, 4}));
        assertTrue(Problems.double23(new int[] {3, 3, 3, 3}));
        assertFalse(Problems.double23(new int[] {2, 4, 3, 5}));
        assertFalse(Problems.double23(new int[] {1, 1, 5, 5}));
        assertFalse(Problems.double23(new int[] {2, 5, 5, 5}));
    }

    @Test
    public void testCapStr()
    {
        assertEquals("", Problems.capStr(""));
        assertEquals("H", Problems.capStr("h"));
        assertEquals("H  ", Problems.capStr("h  "));
        assertEquals("Hello World", Problems.capStr("hello world"));
        assertEquals("  Hello World", Problems.capStr("  hello world"));
        assertEquals("Bowl With White Rice And Some Fajita Veggies And Verde Salsa", 
                Problems.capStr("Bowl with white rice and some fajita veggies and verde salsa"));
    }

    @Test
    public void testCaseBingo()
    {
        assertTrue(Problems.caseBingo(new char[][] {{'a', 'b', 'c'}, {'A', 'b', 'c'}, {'A', 'c', 'b'}}));
        assertTrue(Problems.caseBingo(new char[][] {{'k', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'c', 'b'}}));
        assertFalse(Problems.caseBingo(new char[][] {{'A', 'b', 'c'}, {'a', 'B', 'c'}, {'a', 'c', 'B'}}));
    }
}
