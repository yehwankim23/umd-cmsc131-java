import static org.junit.Assert.*;

import org.junit.Test;

public class PublicTests {

    @Test
    public void addContact() {
        Contact contactOne = new Contact(new Name("Brienne", "Tarth", ""));

        assertFalse(contactOne.addPhoneNumber(""));
        assertFalse(contactOne.addPhoneNumber("123 456 7890"));
        assertFalse(contactOne.addPhoneNumber("1234567890"));
        assertFalse(contactOne.addPhoneNumber("123-456-789A"));
        assertFalse(contactOne.addPhoneNumber("1234-456-789"));
        assertFalse(contactOne.addPhoneNumber("1234-456-7890"));
        assertTrue(contactOne.addPhoneNumber("123-456-7890"));

        assertEquals("Name: Tarth, Brienne (Phone Number: 123-456-7890)", contactOne.toString());
    }

    @Test
    public void testContactManagerAdd() {
        ContactManager cMgr = new ContactManager();

        assertFalse(cMgr.addContact(null, "Snow", "", "(000) 000-0000"));
        assertTrue(cMgr.addContact("John", "Targaryen", "", "000-000-0000"));
        assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));

        assertEquals(2, cMgr.countContacts());
    }

    @Test
    public void testRemoveContacts() {
        Contact[] cs = new Contact[3];
        cs[0] = new Contact(new Name("White", "Snow", ""));
        cs[0].addPhoneNumber("300-000-9999");
        cs[1] = new Contact(new Name("White", "Hat", ""));
        cs[1].addPhoneNumber("300-000-9999");
        cs[2] = new Contact(new Name("Red", "Hat", ""));
        cs[2].addPhoneNumber("000-000-0000");

        ContactManager cMgr = new ContactManager(cs);

        cMgr.removeContact(new Name("Red", "Hat", ""));
        assertEquals(2, cMgr.countContacts());
    }

    @Test
    public void testContainContacts() {
        Contact[] cs = new Contact[3];
        cs[0] = new Contact(new Name("White", "Snow", ""));
        cs[0].addPhoneNumber("300-000-9999");
        cs[1] = new Contact(new Name("White", "Hat", ""));
        cs[1].addPhoneNumber("300-000-9999");
        cs[2] = new Contact(new Name("Red", "Hat", ""));
        cs[2].addPhoneNumber("000-000-0000");

        ContactManager cMgr = new ContactManager(cs);

        assertTrue(cMgr.contains(new Name("Red", "Hat", "")));

    }

    @Test
    public void testContactManagerAddArray() {
        Contact[] cs = new Contact[3];
        cs[0] = new Contact(new Name("White", "Snow", ""));
        cs[0].addPhoneNumber("300-000-9999");
        cs[1] = new Contact(new Name("White", "Hat", ""));
        cs[1].addPhoneNumber("300-000-9999");
        cs[2] = new Contact(new Name("Red", "Hat", ""));
        cs[2].addPhoneNumber("000-000-0000");

        ContactManager cMgr = new ContactManager(cs);
        assertEquals(3, cMgr.countContacts());
    }

    @Test
    public void testContactManagerCount() {
        ContactManager cMgr = new ContactManager();

        assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));
        assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));
        assertTrue(cMgr.addContact("Tyrion", "Lannister", null, "000-000-0000"));
        assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));
        assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));
        assertTrue(cMgr.addContact("Bran", "Stark", "", "300-000-9999"));
        assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));

        assertEquals(7, cMgr.countContacts());
    }

    @Test
    public void testToString() {
        ContactManager cMgr = new ContactManager();

        assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));
        assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));

        System.out.println(cMgr.toString());
        
        assertEquals("Name: Lannister, Tyrion (Phone Number: 100-555-8888)\n" + 
                "Name: Stark, Catelyn (Phone Number: 300-000-9999)", cMgr.toString());
    }
}