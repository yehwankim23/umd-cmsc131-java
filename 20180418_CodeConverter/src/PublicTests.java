import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class PublicTests {
    CodeConverter codeConv;

    @Before
    public void buildCode() throws IOException {
        codeConv = new CodeConverter();
        codeConv.buildCodeTable("MorseCode.txt");
    }

    @Test
    public void testText2MorseSOS() {
        assertEquals("... --- ...", codeConv.toMorseCode("SOS")); 
    }
 
    @Test
    public void testText2MorseSOS2() {
        assertEquals("... --- ...", codeConv.toMorseCode("  SOS  ")); 
    }
 
    @Test
    public void testText2MorseAB() {
        assertEquals(".-   -...", codeConv.toMorseCode("A B")); 
    }
    
    @Test
    public void testText2MorseABWithPct() {
        assertEquals(".-   -...", codeConv.toMorseCode("a% B")); 
    }
    
    @Test
    public void testMorse2TextSOS() {
        assertEquals("SOS", codeConv.toAlphaNumeric("... --- ..."));
    }
            
    @Test
    public void testMorse2TextSOSWithWhiteSpace() {
        assertEquals("S O S", codeConv.toAlphaNumeric("   ...   ---   ...        "));
    }
            
    @Test
    public void testMorse2TextAB() {
        assertEquals("A B", codeConv.toAlphaNumeric(".-   -...")); 
    }

    @Test
    public void testCountByCodeLength() {
        assertEquals(2, codeConv.countByCodeLength(1)); 
    }
}
