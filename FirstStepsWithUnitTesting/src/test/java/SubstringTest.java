import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringTest {

    @Test
    public void Test_removeOccurrences_RemovesSubstringFromMiddle() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String toRemove = "fox";
        String result = Substring.removeOccurrences(toRemove, text);
        assertEquals("The quick brown jumps over the lazy dog.", result);
    }

}