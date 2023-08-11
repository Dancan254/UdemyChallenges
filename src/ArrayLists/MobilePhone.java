package ArrayLists;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }
    //method to add a new contact
    public boolean addContact(Contact contact){
        int contactExists = findContact(contact);
        if (contactExists >= 0){
            System.out.println("Contact already exits");
            return false;
        }
        contacts.add(contact);
        return true;
    }
    //method to remove contact
    public boolean removeContact(Contact contact){
        int contactExists = findContact(contact);
        if (contactExists >= 0){
            System.out.println("Removing contact >>>");
            contacts.remove(contact);
            System.out.println(contact + " already removed");
            return true;
        }
        System.out.println("Contact does not exist");
        return false;
    }
    //method to update contacts
    public boolean updateContact(Contact oldContact, Contact newContact){
        int countOfContact = findContact(oldContact);
        if (countOfContact >= 0){
            contacts.set(countOfContact, newContact);
            System.out.println("Contact updated to: " + newContact);
            return true;
        }
        System.out.println("Did not find contact. Check and try again");
        return false;
    }

    //method to find contact
    private int findContact(String name){
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).getName() + " -> " + contacts.get(i).getPhoneNumber());
        }
    }
    //method to find contact
    private int findContact(Contact contact){
        return contacts.indexOf(contact);
    }

}
