import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    public void Test_ValidEmail_ReturnsTrue() {
        String email = "info@softuni.bg";
        boolean result = EmailValidator.isValid(email);
        assertTrue(result);
    }
}