import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {
    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Test@123"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(PasswordValidator.isValid("weak"));
    }
}
