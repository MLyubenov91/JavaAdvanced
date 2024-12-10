import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchNamesTest {

    @Test
    public void Test_Match_ValidNames_ReturnsMatchedNames() {
        String input = "John Doe lives on James Johnson blvd.";
        String result = MatchNames.Match(input);
        assertEquals("John Doe James Johnson", result);
    }
}