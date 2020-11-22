import static org.junit.Assert.*;
import org.junit.Test;

public class PublicTests {
    final static int nWords = 2266;

    @Test
    public void testCreateDisguisedWord() {
        assertEquals("______", Hangman.createDisguisedWord("option"));
    }
        
    @Test
    public void testInitGuesses() {
        assertEquals(8, Hangman.initGuesses("option"));
        assertEquals(8, Hangman.initGuesses("concern"));
    }
    
    @Test
    public void testIsValidGuess() {
        assertTrue(Hangman.isValidGuess("a", "agnostic"));
        assertFalse(Hangman.isValidGuess("e", "agnostic"));
        assertTrue(Hangman.isValidGuess("tic", "agnostic"));
        assertFalse(Hangman.isValidGuess("tion", "agnostic"));
    }
    
    @Test
    public void testIsValidWord() {
        assertFalse(Hangman.isValidWord("Work"));
        assertTrue(Hangman.isValidWord("binocular"));
        assertFalse(Hangman.isValidWord("sadness"));
        assertFalse(Hangman.isValidWord("renovate the room"));
    }
           
    @Test
    public void testIsWordRevealed() {
        assertFalse(Hangman.isWordRevealed("option", "______"));
        assertFalse(Hangman.isWordRevealed("option", "optio_"));
        assertFalse(Hangman.isWordRevealed("option", "_pti_n"));
        assertTrue(Hangman.isWordRevealed("option", "option"));
    }
 
    @Test
    public void testMakeGuess() {
        assertEquals("optio_", Hangman.makeGuess("g", "option", "optio_"));
        assertEquals("option", Hangman.makeGuess("n", "option", "optio_"));
        assertEquals("opt___", Hangman.makeGuess("opt", "option", "______"));
        assertEquals("_p_ion", Hangman.makeGuess("ion", "option", "_p____"));
        assertEquals("option", Hangman.makeGuess("pt", "option", "op_ion"));
    }
}
