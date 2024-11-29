import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFilterTest {

    @Test
    public void Test_Filter_WhenNoBannedWords_ShouldReturnOriginalText() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String[] bannedWords = {};
        String result = TextFilter.Filter(bannedWords, text);
        assertEquals(text, result);
    }

    @Test
    public void Test_Filter_WhenBannedWordExists_ShouldReplaceBannedWordWithAsterisks() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String[] bannedWords = {"fox"};
        String result = TextFilter.Filter(bannedWords, text);
        assertEquals("The quick brown *** jumps over the lazy dog.", result);
    }

    @Test
    public void Test_Filter_WhenBannedWordsAreEmpty_ShouldReturnOriginalText() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String[] bannedWords = {"", "", ""};
        String result = TextFilter.Filter(bannedWords, text);
        assertEquals(text, result);
    }

    @Test
    public void Test_Filter_WhenBannedWordsContainWhiteSpace_ShouldReplaceBannedWord() {
        String text = "The quick brown fox jumps over the lazy dog.";
        String[] bannedWords = {"brown fox"};
        String result = TextFilter.Filter(bannedWords, text);
        assertEquals("The quick ********* jumps over the lazy dog.", result);
    }

    @Test
    public void Test_Filter_WhenBannedWordExists_ShouldReplaceAllOccurrencesOfBannedWord() {
        String text = "The fox quick brown fox jumps over the fox lazy dog.";
        String[] bannedWords = {"fox"};
        String result = TextFilter.Filter(bannedWords, text);
        assertEquals("The *** quick brown *** jumps over the *** lazy dog.", result);
    }
}