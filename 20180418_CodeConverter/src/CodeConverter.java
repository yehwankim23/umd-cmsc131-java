import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class CodeConverter {

    Map<Character, String> codeMap;  // map from alphanumeric to Morse code
    Map<String, Character> invCodeMap; // map from Morse code to alphanumeric

    /** DO NOT MODIFY THE DECLARATION LINES ABOVE */

    /**
     * Default constructor. Initialize the instance variable.
     */
    public CodeConverter() {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Read codeFile and beef up the code list. Each line in the codeFile has two
     * fields (letter, codeString) separated by a comma.
     * 
     * @param codeFile
     * @throws IOException
     */
    public void buildCodeTable(String codeFile) throws IOException {
        Scanner input = new Scanner(new File(codeFile));

        // ADD YOU CODE HERE
        
        input.close();
    }

    /**
     * Convert a text to the corresponding Morse code sequence, and return the Morse
     * code sequence. Before conversion, convert all characters in the input text to
     * upper-cases and also remove all leading and trailing whitespace chars of the
     * input text.
     * 
     * For each letter (A-Z) or a number in the text, the corresponding Morse code
     * will be added to the output code sequence. Between the Morse codes for
     * alphanumeric char, insert a space. The space in the text will be replaced
     * with three spaces. Ignore all other characters.
     * 
     * For example, Both "A b" and "A% b" will be encoded to ".- -...".
     * 
     * @param text
     *            a sequence of characters.
     * @return the Morse code corresponding to the input text
     */
    public String toMorseCode(String text) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Convert a Morse code sequence to the corresponding alphanumeric text, and
     * return the text. Before conversion, remove all leading and trailing
     * whitespace chars of the input text.
     * 
     * Note that symbols are separated with a space. The three consecutive spaces
     * will be converted to a single space character in the output text. You may
     * want to maintain two maps for this assignment -- one for Text to Morse, and
     * the other for Morse to Text).
     * 
     * For example, "... --- ..." will be converted to "SOS".
     * 
     * @param morseCodeSeq
     *            a sequence of Morse code symbols.
     * @return the text corresponding to the Morse code
     */
    public String toAlphaNumeric(String morseCodeSeq) {
        throw new UnsupportedOperationException("replace with your implementation");
    }


    /**
     * This methods count how many Morse codes has symbols equal to the len input
     * parameter. For example, if the input parameter is 1, this method should
     * return 2 (The Morse code for 'E' is '.' and for 'T' is '-'.)
     * 
     * @param len
     * @return the number of keys of which Morse code is encoded with 'len' symbols.
     */
    public int countByCodeLength(int len) {
        throw new UnsupportedOperationException("replace with your implementation");
    }
    
    
    /**
     * The main method is not needed for this assignment but you can use it as a
     * driver to run a few test cases. It is recommended to write your tests in the
     * StudentTests class and run it as JUnit tests as you run PublicTests.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        CodeConverter codeConv = new CodeConverter();
        codeConv.buildCodeTable("MorseCode.txt");

        String morseCode = codeConv.toMorseCode("CMSC 131");
        System.out.println(morseCode);
        String text = codeConv.toAlphaNumeric(morseCode);
        System.out.println(text);
    }
}
