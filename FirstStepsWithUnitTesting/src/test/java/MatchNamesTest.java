import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchNamesTest {

    @Test
    public void Test_Match_ValidNames_ReturnsMatchedNames() {
        String input = "John Doe lives on James Johnson blvd.";
        String result = MatchNames.Match(input);
        assertEquals("John Doe James Johnson", result);
    }

    @Test
    public void Test_Match_OnlyOneValidName_ReturnsMatchedName() {
        String input = "John Doe lives on James johnson blvd.";
        String result = MatchNames.Match(input);
        assertEquals("John Doe", result);
    }

    @Test
    public void Test_Match_NoValidNames_ReturnsEmptyString() {
        String input = "john Doe lives on James johnson blvd.";
        String result = MatchNames.Match(input);
        assertEquals("", result);
    }

    @Test
    public void Test_Match_EmptyInput_ReturnsEmptyString() {
        String input = "";
        String result = MatchNames.Match(input);
        assertEquals("", result);
    }

    @Test
    public void Test_Match_NullInput_ThrowsNullPointerException() {
        String input = null;
        assertThrows(NullPointerException.class, () -> MatchNames.Match(input));
    }
}