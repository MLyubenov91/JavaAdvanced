import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchPhoneNumbersTest {

    @Test
    public void Test_Match_ValidPhoneNumbers_ReturnsMatchedNumbers() {
        String input = "+359-2-123-4567 test test +359 2 456 7890";
        String result = MatchPhoneNumbers.Match(input);
        assertEquals("+359-2-123-4567, +359 2 456 7890", result);
    }

}