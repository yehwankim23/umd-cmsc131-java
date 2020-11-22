import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class Tests {
    BookMain bm;

    @Before
    public void testA() {
        String s = "In addition, it made us tolerant of each other's\n" + "yarns--and even convictions. ";
        bm = new BookMain();
        Scanner input = new Scanner(s);
        bm.analyzeBookText(input);
        
        System.out.println(bm.statToString());
    }

    @Test
    public void testTotalCount() {
        int totalCount = bm.letterData.totalCount();
        assertEquals(61, totalCount);
    }

    @Test
    public void testFreqChar() {
        assertEquals(4, bm.letterData.freqChar('s'));
    }

    @Test
    public void testComputeEntropy() {
        int entropy = bm.letterData.computeEntropy();
        assertEquals(3, entropy);
    }

    @Test
    public void testGetRawCount() {
        int count = bm.wordData.getRawCount();
        assertEquals(13, count);
    }

    @Test
    public void testUniqueCount() {
        int count = bm.wordData.getUniqueCount();
        assertEquals(13, count);
    }

    @Test
    public void testAvgWordLength() {
        String avgWL = bm.wordData.avgWordLength();
        assertEquals("4.69", avgWL);
    }

    @Test
    public void testLongestWord() {
        int lenLongestWord = bm.wordData.longestWord();
        assertEquals(11, lenLongestWord);
    }

    @Test
    public void testOneSentence() {
        int nSentences = bm.sentenceData.getCount();
        assertEquals(1, nSentences);
    }

    @Test
    public void testMultipleSentences() {
        BookMain bm2 = new BookMain();
        String s = 
                "Theodor Seuss Geisel (March 2, 1904--September 24, 1991) was an American " + 
                "author, political cartoonist, poet, animator, book publisher, and artist, " +
                "best known for authoring more than 60 children's books under the pen name" +
                "Doctor Seuss. His work includes several of the most" +
                "popular children's books of all time, selling over 600 million copies and " +
                "being translated into more than 20 languages by the time of his death.";
        Scanner input = new Scanner(s);
        bm2.analyzeBookText(input);
        System.out.println(bm2.statToString());

        assertEquals(2, bm2.sentenceData.getCount());
    }

    @Test
    public void testAveSentenceLength() {
        String nAvgSentenceLen = bm.sentenceData.avgSentenceLength();
        assertEquals("13.00", nAvgSentenceLen);
    }

    @Test
    public void testCleanWord() {
        String a = "don't";
        assertEquals("dont", WordLib.cleanWord(a));

        String b = "single-dash";
        assertEquals("single-dash", WordLib.cleanWord(b));
    }

    @Test
    public void testSplitDash() {
        String a = "yarns--and";
        String[] arr = WordLib.splitDash(a);
        assertEquals("yarns", arr[0]);
        assertEquals("and", arr[1]);

        String b = "single-dash";
        String[] arr2 = WordLib.splitDash(b);
        assertEquals("single-dash", arr2[0]);
        assertEquals("", arr2[1]);
    }

    @Test
    public void testFreqWord() {
        assertEquals(1, bm.wordData.freqWord(new Word("EACH")));
        assertEquals(0, bm.wordData.freqWord(new Word("THERE")));
    }
}
