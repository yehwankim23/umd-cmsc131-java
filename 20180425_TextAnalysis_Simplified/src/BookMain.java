import java.util.Scanner;
import java.io.File;

public class BookMain {
    /**
     * DO NOT MODIFY VARIABLE DECLARATIONS
     */
    LetterTally letterData;
    WordTally wordData;
    SentenceTally sentenceData;

    /**
     * DO NOT MODIFY THIS METHOD.
     */
    public BookMain() {
        letterData = new LetterTally();
        wordData = new WordTally();
        sentenceData = new SentenceTally();       
    }

    /**
     * DO NOT MODIFY THIS METHOD.
     * 
     * You are still allowed to change the input file name to see the output for
     * different files.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BookMain bm = new BookMain();
        
        Scanner input = new Scanner(new File("PrideAndPrejudice.txt"));
        bm.readHeader(input);
        bm.analyzeBookText(input);
        System.out.println(bm.statToString());
        input.close();
    }

    /**
     * This method analyzes the book text data. Complete this method.
     * 
     * @param input
     */
    public void analyzeBookText(Scanner input) {
        while (input.hasNext()) {
            String token = input.next();
            letterData.addLetter(token.charAt(0));
        }
    }

    
    /**
     * DO NOT MODIFY THIS METHOD. YOU MAY USE IT TO SEE THE ANALYSIS RESULTS.
     * 
     * @param letterData
     * @param wordData
     * @param sentenceData
     */
    public String statToString() {
        String s = "";

        s += "Raw letter count: " + letterData.totalCount() + "\n";
        s += "Letter entropy: " + letterData.computeEntropy() + "\n";
        s += "Raw word count: " + wordData.getRawCount() + "\n";
        s += "Unique word count: " + wordData.getUniqueCount() + "\n";
        s += "Longest word: " + wordData.longestWord() + "\n";
        s += "Average word length: " + wordData.avgWordLength() + "\n";
        s += "Sentence count: " + sentenceData.getCount() + "\n";
        s += "Average sentence length: " + sentenceData.avgSentenceLength() + "\n";

        return s;
    }

    /**
     * DO NOT MODIFY THIS METHOD. IT EATS UP THE HEADER LINES
     * 
     * @param input
     */
    private void readHeader(Scanner input) {
        int nHeaderLine = 31; // a fixed number of header lines for the book.
        int nCurLine = 0;
        while (input.hasNext() && nCurLine < nHeaderLine) {
            input.nextLine();
            nCurLine++;
            if (nCurLine == nHeaderLine)
                break;
        }
    }
}
