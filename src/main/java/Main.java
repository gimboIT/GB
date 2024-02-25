public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Tim", "863488632");
        phoneBook.addContact("Tom", "876543210");
        phoneBook.addContact("Kate", "812598975");

        phoneBook.printContactsSortedByPhoneNumbers();
    }
}
