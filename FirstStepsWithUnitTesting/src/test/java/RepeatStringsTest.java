import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatStringsTest {

    private RepeatStrings repeater;

    @BeforeEach
    void setup() {
        repeater = new RepeatStrings();
    }

    @Test
    public void helloShouldBeRepeatedFiveTimes() {
        String[] input = {"Hello"};
        var result = repeater.repeat(input);
        assertEquals("HelloHelloHelloHelloHello", result);
    }

    @Test
    public void arrayOfThreeOneLetterWordsShouldBeOneThreeLetterWord() {
        String[] input = {"a", "b", "c"};
        var result = repeater.repeat(input);
        assertEquals("abc", result);
    }

    @Test
    public void emptyStringShouldNotBeRepeated() {
        String[] input = {"a", "", "c"};
        var result = repeater.repeat(input);
        assertEquals("ac", result);
    }

    @Test
    public void whiteSpaceStringShouldBeRepeated() {
        String[] input = {"a", "  ", "c"};
        var result = repeater.repeat(input);
        assertEquals("a    c", result);
    }

    @Test
    public void emptyInputShouldReturnEmptyString() {
        String[] input = {};
        var result = repeater.repeat(input);
        assertEquals("", result);
    }
}