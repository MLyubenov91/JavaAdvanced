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

    @Test
    public void Test_removeOccurrences_RemovesSubstringFromStart() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String toRemove = "The";
        String result = Substring.removeOccurrences(toRemove, text);
        assertEquals("quick brown fox jumps over the lazy dog.", result);
    }

    @Test
    public void Test_removeOccurrences_RemovesSubstringFromEnd() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String toRemove = "dog.";
        String result = Substring.removeOccurrences(toRemove, text);
        assertEquals("The quick brown fox jumps over the lazy", result);
    }

    @Test
    public void Test_removeOccurrences_RemovesAllOccurrences() {
        String text = "The quick fox brown fox fox jumps over fox the lazy fox dog.";
        String toRemove = "fox";
        String result = Substring.removeOccurrences(toRemove, text);
        assertEquals("The quick brown jumps over the lazy dog.", result);
    }

    @Test
    public void Test_removeOccurrences_ThrowsIllegalArgumentExceptionWhenTextIsNull() {
        String text = null;
        String toRemove = "fox";
        assertThrows(IllegalArgumentException.class, () -> Substring.removeOccurrences(toRemove, text));
    }

    @Test
    public void Test_removeOccurrences_ThrowsIllegalArgumentExceptionWhenSubstringIsNull() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String toRemove = null;
        assertThrows(IllegalArgumentException.class, () -> Substring.removeOccurrences(toRemove, text));
    }

}