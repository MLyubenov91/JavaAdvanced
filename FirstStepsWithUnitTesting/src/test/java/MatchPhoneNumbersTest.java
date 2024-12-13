import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchPhoneNumbersTest {

    @Test
    public void Test_Match_ValidPhoneNumbers_ReturnsMatchedNumbers() {
        String input = "+359-2-123-4567 test test +359 2 456 7890";
        String result = MatchPhoneNumbers.Match(input);
        assertEquals("+359-2-123-4567, +359 2 456 7890", result);
    }

    @Test
    public void Test_Match_NoValidPhoneNumbers_ReturnsEmptyString() {
        String input = "+359-2-1234 567 test test +359/2/456/7890";
        String result = MatchPhoneNumbers.Match(input);
        assertEquals("", result);
    }

    @Test
    public void Test_Match_EmptyInput_ReturnsEmptyString() {
        String input = "";
        String result = MatchPhoneNumbers.Match(input);
        assertEquals("", result);
    }

    @Test
    public void Test_Match_MixedValidAndInvalidNumbers_ReturnsOnlyValidNumbers() {
        String input = "+359-2-123-4567 +359 2 456 7890 +359-2-1234 567 +359/2/456/7890";
        String result = MatchPhoneNumbers.Match(input);
        assertEquals("+359-2-123-4567, +359 2 456 7890", result);
    }

}