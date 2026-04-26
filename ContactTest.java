package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreation() {
        Contact c = new Contact("12345", "Jose", "Magg", "1234567890", "123 Street");
        assertEquals("12345", c.getContactId());
        assertEquals("Jose", c.getFirstName());
    }

    @Test
    public void testInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Jose", "Magg", "1234567890", "123 Street");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jose", "Magg", "123", "123 Street");
        });
    }
}


