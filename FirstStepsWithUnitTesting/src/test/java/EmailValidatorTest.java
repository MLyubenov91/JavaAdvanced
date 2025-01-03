import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    public void Test_ValidEmail_ReturnsTrue() {
        String email = "info@softuni.bg";
        boolean result = EmailValidator.isValid(email);
        assertTrue(result);
    }

    @Test
    public void Test_InvalidEmail_ReturnsFalse() {
        String email = "some.info@soft@uni.bg";
        boolean result = EmailValidator.isValid(email);
        assertFalse(result);
    }
}