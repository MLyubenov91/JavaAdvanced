import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAndConcatenateTest {

    @Test
    public void Test_EmptyInput_ReturnsEmptyString() {
        String[] input = {};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("", result);
    }

}