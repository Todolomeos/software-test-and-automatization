package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "Jose", "Magg", "1234567890", "123 Street");
        service.addContact(c);
        assertEquals(1, service.getContacts().size());
    }

    @Test
    public void testDuplicateId() {
        ContactService service = new ContactService();
        Contact c1 = new Contact("1", "Jose", "Magg", "1234567890", "123 Street");
        Contact c2 = new Contact("1", "Ana", "Lopez", "0987654321", "456 Ave");

        service.addContact(c1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(c2);
        });
    }

    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "Jose", "Magg", "1234567890", "123 Street");
        service.addContact(c);

        service.updateFirstName("1", "Juan");

        assertEquals("Juan", service.getContacts().get(0).getFirstName());
    }
}
