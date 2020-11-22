import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class StudentTests {
    CodeConverter codeConv;

    @Before
    public void buildCode() throws IOException {
        codeConv = new CodeConverter();
        codeConv.buildCodeTable("MorseCode.txt");
    }

    @Test
    public void testText2MorseYourTest() {
        assertEquals("-.-- --- ..- .-.   - . ... -", codeConv.toMorseCode("Your Test")); 
    }
}
