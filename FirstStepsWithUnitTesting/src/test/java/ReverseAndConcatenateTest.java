import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAndConcatenateTest {

    @Test
    public void Test_EmptyInput_ReturnsEmptyString() {
        String[] input = {};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("", result);
    }

    @Test
    public void Test_SingleString_ReturnsSameString() {
        String[] input = {"test"};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("test", result);
    }

    @Test
    public void Test_MultipleString_ReturnsReversedConcatenatedString() {
        String[] input = {"Test", "Simple", "One"};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("OneSimpleTest", result);
    }

    @Test
    public void Test_NullInput_ReturnsEmptyString() {
        String[] input = null;
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("", result);
    }

    @Test
    public void Test_WhiteSpaceInput_ReturnsConcatenatedString() {
        String[] input = {"Test", " ", "Simple"};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("Simple Test", result);
    }

    @Test
    public void Test_LargeInput_ReturnsReversedConcatenatedString() {
        String[] input = {"Pernik", "From", "Martin", "Am", "I"};
        String result = ReverseAndConcatenate.ReverseAndConcatenateStrings(input);
        assertEquals("IAmMartinFromPernik", result);
    }

}