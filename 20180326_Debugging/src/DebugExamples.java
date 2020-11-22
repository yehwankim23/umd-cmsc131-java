
public class DebugExamples {

    /**
     * This question is from codingBat String-2 section.
     * 
     * Given a string, the doubleChar method returns a string where for every char
     * in the original, there are two chars.
     * 
     * The xyzMiddle method below is a faulty version. Find errors using debugger
     * and try to fix the method.
     * 
     */
    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i) + str.charAt(i);
        }

        return newStr;
    }

    
    /**
     * This question is a variant of the matchUp in codingBat Array-2 section.
     * 
     * Given arrays nums1 and nums2 of the same length, for every element in nums1,
     * consider the corresponding element in nums2 (at the same index). Return the
     * count of the number of times that the integer distance between the element 
     * in nums1 multiplied by 2 and the corresponding element in nums2 is equal to 
     * 1 or smaller. For example, the distance between -1 in nums1 and -5 in nums2 
     * is 4.
     * 
     * The roughlyDoubled method below is a faulty version. Find errors using
     * debugger and try to fix the method.
     * 
     * roughlyDoubled([1, 2, 3], [2, 3, 7]) returns 3 
     * roughlyDoubled([1, 2, 3], [2, 3, 9]) returns 2 
     * roughlyDoubled([1, 2, 3], [7, 0, 5]) returns 1
     * roughlyDoubled([1, 2, 3], [0, 2, 3]) returns 0
     * 
     * @param nums1
     * @param nums2
     * @return
     */
    public static int roughlyDoubled(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int doubled = nums1[i] * 2;
            int diff = nums2[i] - doubled;
            if (diff < 1) {
                count++;
            }
        }

        return count;
    }

  
    /**
     * This question is from codingBat String-2 section.
     * 
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle, we'll say that the number of chars to the left and right of the "xyz"
     * must differ by at most one. This problem is harder than it looks.
     * 
     * The xyzMiddle method below is a faulty version. Find errors using debugger
     * and try to fix the method. You will need to change the code significantly to
     * fix.
     * 
     * @param str
     * @return
     */
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int loc = str.indexOf("xyz");

        if (loc == -1)
            return true;

        int nLeft = loc;
        int nRight = len - loc;
        int lrDiff = Math.abs(nLeft - nRight);

        return (lrDiff > 1) ? false : true;
    }

}
