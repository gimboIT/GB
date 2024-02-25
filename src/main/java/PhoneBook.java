import java.util.*;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, Contact::new).addPhoneNumber(phoneNumber);
    }

    public void printContactsSortedByPhoneNumbers() {
        List<Contact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(c -> c.getPhoneNumbers().size()));

        Collections.reverse(sortedContacts);

        for (Contact contact : sortedContacts) {
            System.out.println("Имя: " + contact.getName());
            System.out.println("Телефоны:");
            for (String phoneNumber : contact.getPhoneNumbers()) {
                System.out.println(phoneNumber);
            }
            System.out.println();
        }
    }
}