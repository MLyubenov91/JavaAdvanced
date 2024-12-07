import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringPatternTest {

    @Test
    public void Test_GeneratePatternedString_ValidInput_ReturnsExpectedResult() {
        String result = StringPattern.GeneratePatternedString("hello", 2);
        assertEquals("hElLohElLo", result);
    }

    @Test
    public void Test_GeneratePatternedString_EmptyInput_ThrowsArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> StringPattern.GeneratePatternedString("", 3));
    }

    @Test
    public void Test_GeneratePatternedString_NegativeRepetitionFactor_ThrowsArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> StringPattern.GeneratePatternedString("hello", -3));
    }

    @Test
    public void Test_GeneratePatternedString_ZeroRepetitionFactor_ThrowsArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> StringPattern.GeneratePatternedString("hello", 0));
    }

}