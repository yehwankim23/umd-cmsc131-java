
public class LetterTally {

    /** Declare instance variables. */
    int rawCount;

    /**
     * Default constructor. Initialize the instance variables in this method.
     * 
     */
    public LetterTally() {
        rawCount = 0;
    }

    public void addLetter(int letter) {
        rawCount++;
    }
    
    
    /**
     * This method returns the number of total letters in the book.
     * 
     * @return the total number of letters in the book
     */
    public int totalCount() {
        return rawCount;
    }

    /**
     * This method returns the number of times a letter appear in the book
     * 
     * @param ch
     *            - the letter of interest
     * 
     * @return
     */
    public int freqChar(char ch) {
        return 0;
    }

    /**
     * This method computes the entropy of the letters. To compute the entropy, for
     * each letter, compute the ratio (say it p) of the frequency count of the
     * letter to the total frequency count of all letters. Then, compute the
     * following value: p * Math.log (1 / p). Return the sum of the values, rounded
     * to the nearest integer value.
     * 
     * @return
     */
    public int computeEntropy() {
        return 0;
    }
}
