import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPatternTest {

    @Test
    public void Test_GeneratePatternedString_EmptyInput_ThrowsArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> StringPattern.GeneratePatternedString("", 3));
    }

}