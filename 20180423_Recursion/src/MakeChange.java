
public class MakeChange {
    public static void main(String[] args) {

        //
        // only check possibilities
        //
        System.out.println(makeChange(3, 5, 9));

        //
        // modified problem to print the number of small and large coins used for giving
        // the change
        //
        CoinType smallCoin = new CoinType(3);
        CoinType largeCoin = new CoinType(5);
        int amount = 13;
        makeChangeCount(smallCoin, largeCoin, amount);
    }

    /** 
     * First complete this question
     * 
     * @param smallCoin
     * @param largeCoin
     * @param amount
     * @return
     */
    public static boolean makeChange(int smallCoin, int largeCoin, int amount) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /** 
     * Do this after completing makeChange
     * 
     * @param smallCoin
     * @param largeCoin
     * @param amount
     * @return
     */
    public static boolean makeChangeCount(CoinType smallCoin, CoinType largeCoin, int amount) {
        //
        // 
        //
        throw new UnsupportedOperationException("replace with your implementation");
    }

}