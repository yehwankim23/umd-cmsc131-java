/**
 * 
 * You must write "ALL" methods and submit to the submit server to get full
 * credit. Hover over method names to see instructions.
 * 
 * String library:
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 * 
 * Source for some problems: codingbat.com
 * 
 * @author CMSC131 instructors
 *
 */
public class Problems {
    /**
     * Given two strings, append them together (known as "concatenation") and return
     * the result. However, if the concatenation creates a double-char, then omit
     * one of the chars, so "abc" and "cat" yields "abcat".
     * 
     * conCat("abc", "cat") -> "abcat" 
     * conCat("dog", "cat") -> "dogcat"
     * conCat("abc", "") -> "abc" 
     * conCat("avocado", "oompa-loompa") -> "avocadoompa-loompa"
     * 
     * @param first
     *            the first string
     * @param second
     *            the second string
     * @return the concatenation of first and second with one occurrence of double
     *         chars removed
     */
    public static String conCat(String first, String second) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * In this method, you will place a (very limited) Chipotle order based on the
     * input. The return String should be "Bowl with ____ rice and ____ fajita
     * veggies and _____ salsa.", where the blanks are filled using the instructions
     * below. If the boolean guac is true, add a space and "Guac please." at the
     * end.
     * 
     * For examples, please see the public tests. You may assume all inputs will be
     * valid.
     * 
     * @param rice
     *            'b' or 'B' for "brown", 'w' or 'W' for "white"
     * @param fajitas
     *            0 for "no", <10 for "some", >=10 for "a lot of"
     * @param salsa
     *            1 for "pico", 2 for "verde", 3 for "corn"
     * @param guac
     *            whether the bowl should have guac or not
     * @return the order as described above
     */

    public static String chipotleOrder(char rice, int fajitas, int salsa, boolean guac) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Count the number of times the word "code" or "Code" appears in a given
     * String.
     * 
     * countCode("code") -> 1 
     * countCode("codingbat") -> 0 
     * countCode("hour of code") -> 1 
     * countCode("I coded during the hour of code") -> 2 
     * countCode("I love code. Code is good. I codeveloped code with my codesigner.") -> 5
     */
    public static int countCode(String str) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given an int array, return true if the array contains 2 twice, or 3 twice.
     * 
     * double23({2, 4, 2, 5}) -> true 
     * double23({3, 3}) -> true 
     * double23({2, 4, 3, 1}) -> false
     * 
     * @param arr
     *            the array
     * @return whether the array contains 2 twice or 3 twice
     */
    public static boolean double23(int[] arr) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given a String, return a capitalized string.
     * 
     * The double quotes in the returned string is simply added to show the returned
     * string. You do not need to add those in the returned string
     * 
     * capStr("hello world") -> "Hello World" 
     * capStr("Why, who makes much of a miracle?") -> Why, Who Makes Much of a Miracle?
     * 
     * @param inStr
     *            the input string
     * @return a new capitalized string
     */
    public static String capStr(String inStr) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given a 2D array of characters, return true if any row, column or diagonal of
     * the table has only lower-case letters. You can assume the bingo table is a
     * square.
     * 
     * @param table
     *          2-D array of characters where each element contains an alphabet (capital or lower-case)
     * @return true if any row, column, or diagonal lower-case letter bingo is found.
     *         false otherwise.
     */
    public static boolean caseBingo(char[][] table) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }
}
