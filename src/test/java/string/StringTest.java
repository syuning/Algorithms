package test.java.string;
import main.java.string.DefangIPaddr;
import main.java.string.ReverseLeftWords;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void testReverseLeftWords() {
        ReverseLeftWords reverseLeftWords = new ReverseLeftWords();
        assertEquals("cdefgab", reverseLeftWords.reverseLeftWords("abcdefg", 2));
    }

    @Test
    public void TestDefangIPaddr() {
        DefangIPaddr defangIPaddr = new DefangIPaddr();
        assertEquals("1[.]1[.]1[.]1", defangIPaddr.defangIPaddr("1.1.1.1"));
    }
}
