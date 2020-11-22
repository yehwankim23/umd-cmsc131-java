
/**
 * CMSC131-010x,030x,040x Project 3 Hangman
 * 
 * You must complete "ALL" methods and also make your program work as an 
 * stand-alone Java program.
 * 
 * Submit to the submit server and check your grade. 
 * 
 * String library:
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 * 
 * @author CMSC131 instructors
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    final static int nWords = 2266;

    /**
     * Do NOT modify this method This method chooses a word from a text file
     * randomly.
     * 
     * @param f
     * @return
     * @throws FileNotFoundException
     */
    public static String chooseWord(File f, Random r) throws FileNotFoundException {
        Scanner fileIn = new Scanner(f);
        try {
            int randInt = r.nextInt(nWords);
            int i = 0;
            while (i != randInt) {
                fileIn.nextLine();
                i++;
            }
            return fileIn.nextLine();
        } catch (Exception e) {
            return "";
        } finally {
            fileIn.close();
        }
    }

    /**
     * This method returns a string that contains underscore characters only. The
     * number of underscore characters must be same to the number of word passed as
     * the input parameter.
     * 
     * @param word
     *            the word selected from the chooseWord method
     * @return
     */
    public static String createDisguisedWord(String word) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method returns true if the guess entered by the player occur in the
     * secret word. Otherwise it return false.
     * 
     * @param guess
     *            a string that contains one or more characters
     * @param secretWord
     *            the word selected from the chooseWord method
     * @return
     */
    public static boolean isValidGuess(String guess, String secretWord) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method finds all occurrences of guess in secretWord and returns new
     * disguisedWord with letters revealed after guess
     * 
     * @param guess
     * @param secretWord
     * @param disguisedWord
     * @return
     */
    public static String makeGuess(String guess, String secretWord, String disguisedWord) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method returns true if the (partially) revealed word (disguisedWord) is
     * identical to the secret word. Otherwise it returns false. If all letters in
     * the secret word are revealed, those two should be identical.
     * 
     * @param secretWord
     * @param disguisedWord
     * @return
     */
    public static boolean isWordRevealed(String secretWord, String disguisedWord) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method computes and returns an integer of which value is 3 greater than
     * the number of unique letters in the secret word.
     * 
     * @param word
     *            the word selected from the chooseWord method
     * @return
     */
    public static int initGuesses(String word) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method returns true if the word selected from the word list satisfies
     * the constraints specified in the project document. Otherwise it returns
     * false.
     * 
     * @param word
     *            the word selected from the chooseWord method
     * @return
     */
    public static boolean isValidWord(String word) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    public static void main(String[] args) throws IOException {
        File f = new File("listOfWords.txt");
        Random rand = new Random(2018);
        Scanner reader = new Scanner(System.in);
        // Do NOT modify the lines above in this method

    }
}