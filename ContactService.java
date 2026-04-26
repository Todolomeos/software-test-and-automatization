package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException("Duplicate ID");
            }
        }
        contacts.add(contact);
    }

    public void deleteContact(String contactId) {
        contacts.removeIf(c -> c.getContactId().equals(contactId));
    }

    public void updateFirstName(String contactId, String newFirstName) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setFirstName(newFirstName);
            }
        }
    }

    public void updateLastName(String contactId, String newLastName) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setLastName(newLastName);
            }
        }
    }

    public void updatePhone(String contactId, String newPhone) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setPhone(newPhone);
            }
        }
    }

    public void updateAddress(String contactId, String newAddress) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setAddress(newAddress);
            }
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
