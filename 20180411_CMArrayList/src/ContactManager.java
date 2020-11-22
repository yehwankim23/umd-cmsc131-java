import java.util.ArrayList;
import java.util.Arrays;

public class ContactManager {
    // declare the contact ArrayList as an instance variable here. 

    
    
    
    
    /**
     * Initialize an empty ContactManager.
     */
    public ContactManager() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Initialize a ContactManager which contains all the Contacts in the given
     * array.
     */
    public ContactManager(Contact[] contacts) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given 4 String parameters, add a contact to the contacts list. If first name
     * or last name is null or an empty string, then do not add a contact but return
     * false.
     * 
     * Otherwise, create a new contact, and add the phone number to the new contact.
     * If the phone number is in a valid format, add the contact to the list and
     * return true. You may not rewrite the validity check method but can simply
     * reuse the Contact class code written for L5.
     * 
     * We allow adding duplicate contacts. Note that there is no limit to how many
     * times this method can be called.
     * 
     * @param fName
     * @param lName
     * @param mName
     * @param phoneNumber
     * @return a boolean value. See the description above
     */
    public boolean addContact(String fName, String lName, String mName, String phoneNumber) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Remove the Contact with Name n from your List. Make no changes if it doesn't
     * exist.
     * 
     * @param n
     */
    public void removeContact(Name n) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Return whether the Contact List contains a Contact with Name n or not. Hint:
     * A 1-line solution exists.
     */
    public boolean contains(Name n) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Return the number of contacts (int) Hint: A 1-line solution exists.
     */
    public int countContacts() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Return a toString of the contacts. The toString() method should call the
     * Contact toString() method and add a new line after every Contact, EXCEPT the
     * last. Example Output with 2 contacts:
     * 
     * Name: __________ (Phone Number: ___-___-____) Name: __________ (Phone Number:
     * ___-___-____)
     */
    public String toString() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

}
