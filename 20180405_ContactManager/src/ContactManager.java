
public class ContactManager {
    
    /**
     * The instance variables are given below. Do NOT modify the two lines
     * 
     */
    private int nContacts;
    private Contact[] contacts;

    
    /**
     * Implement the constructor of ContactManager class. In the constructor,
     * allocate an array of Contact. Use the nMaxContact as the length of the array
     * Initialize the nContacts to 0 in the constructor.
     * 
     */
    public ContactManager(int nMaxContact) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given 4 String parameters, add a contact to the contacts array. Before adding
     * a contact to the array, do a parameter sanity check in this method. If the
     * array is full, or if first name or last name is null or an empty string, do
     * not add a contact but return false instead. Middle name can be left as null
     * or an empty String. Note that we allow adding duplicate contacts.
     * 
     * If the name is acceptable, create a new contact and add the phone number to
     * the contact by calling the addPhoneNumber method of the Contact object. If
     * the method returns false, do not add the contact to the array and return
     * false (i.e., we discard the contact instantiated.) Otherwise, add the contact
     * to the array and return true.
     * 
     * @param fName
     * @param lName
     * @param mName
     * @param phoneNumber
     * 
     * @return a boolean value. See the description above
     */
    public boolean addContact(String fName, String lName, String mName, String phoneNumber) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * Given a Contact object, return the number of contacts with the identical name
     * (i.e., they have identical first, last, and middle name. If the input
     * parameter is null, return -1.
     * 
     * For example, if the contacts array contains 10 contacts and there are 3
     * elements have the same name, return 3.
     * 
     * @return an int value. See the description above.
     */
    public int countEqualContacts(Contact c) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }

    /**
     * This method returns the number of contacts (int)
     */
    public int countContacts() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
    }
}
