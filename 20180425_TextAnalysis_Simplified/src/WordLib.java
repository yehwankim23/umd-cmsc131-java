
public class WordLib {

    /**
     * This method takes a token (a space-separated letter sequence in the book
     * data) and return a new string that does not contain any of the symbols listed
     * below. That is, it removes the symbols from the word.
     * 
     * Symbols to be removed: , . ? ; ! : ' " ( ) _ \u201C \u201D
     * 
     * The \u201C and \u201D are the left and right double quotation marks in
     * Unicode.
     * 
     * @param w
     *            a token read from the book
     * @return a string without the listed symbols
     */
    public static String cleanWord(String w) {
        return w;
    }

    /**
     * This method takes a token (a space-separated letter sequence in the book
     * data) and return a new array of words when the token contains two words
     * separated by double dashes. Assume that no token contains two double dashes
     * (e.g., hello--world--houston) or has triple dashes.
     * 
     * If "hello--world" is the input, a new array of length 2 must be returned
     * where the first and the second element of the array are "hello" and "world",
     * respectively. There are edge cases. For example, "Hello--" or "--World". For
     * such cases, the first and/or the second element of the new array will have an
     * empty string.
     * 
     * If the input does not contain a double dash, the first array element will has
     * the input token as-is and the second element will be set to an empty string.
     * 
     * @param w
     *            a token read from the book
     * @return an array of words
     */
    public static String[] splitDash(String w) {
        return new String[] {"",""};
    }

}
