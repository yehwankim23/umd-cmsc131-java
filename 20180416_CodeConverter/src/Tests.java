import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Tests {
    CodeConverter codeConv;

    @Before
    public void buildCode() throws IOException {
        codeConv = new CodeConverter();
        codeConv.buildCodeTable("MorseCode.txt");
    }

    @Test
    public void testMorseCode() throws IOException {
        assertEquals("-- --- .-. ... .    -.-. --- -.. .", codeConv.convertText("MORSE CODE")); 
    }

    @Test
    public void testSOS() {
        assertEquals("... --- ...", codeConv.convertText("SOS")); 
    }
}
