import static org.junit.Assert.*;

import org.junit.Test;

public class PublicTests {
	@Test
	public void testName() {
		Name nameOne = new Name ("Davos", "Seaworth", "");
		assertEquals("Seaworth, Davos", nameOne.toString());
		
		Name nameTwo = new Name ("Davos", "Seaworth", "'Onion Knight'");
		assertEquals("Seaworth, Davos 'Onion Knight'", nameTwo.toString());
		
		Name nameThree = new Name("Davos", "Seaworth", "'Onion Knight'");
		assertFalse(nameOne.equals(nameTwo));
		assertTrue(nameTwo.equals(nameThree));
	}
	
	@Test
	public void testEqualNames() {
		Name nameOne = new Name("Hodor", "Hodor", "");
		assertTrue(nameOne.equals(nameOne));
		
		Name nameTwo = new Name("Hodor", "Hodor", "Hodor");
		Name nameThree = new Name("Hodor", "Hodor", "Hodor");
		assertFalse(nameOne.equals(nameTwo));
		assertTrue(nameTwo.equals(nameThree));
		assertTrue(nameThree.equals(nameTwo));
	}
	
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
	public void testEqualContacts() {
		Contact contactOne = new Contact(new Name("Oberyn", "Martell", ""));
		assertTrue(contactOne.equals(contactOne));
		
		Contact contactTwo = new Contact(new Name("Oberyn", "Martell", "Nymeros"));
		Contact contactThree = new Contact(new Name("Oberyn", "Martell", "Nymeros"));
		
		assertFalse(contactOne.equals(contactTwo));
		assertTrue(contactTwo.equals(contactThree));
		assertTrue(contactThree.equals(contactTwo));
	}
	
	@Test
	public void testContactManagerAdd() {
		ContactManager cMgr = new ContactManager(5);

		assertFalse(cMgr.addContact(null, "Snow", "", "(000) 000-0000"));
		assertTrue(cMgr.addContact("John", "Targaryen", "", "000-000-0000"));
		assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));
		
		assertEquals(2, cMgr.countContacts());
	}

	@Test
	public void testContactManagerCount() {
		ContactManager cMgr = new ContactManager(10);

		assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));
		assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));
		assertTrue(cMgr.addContact("Tyrion", "Lannister", null, "000-000-0000"));
		assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));
		assertTrue(cMgr.addContact("Catelyn", "Stark", "", "300-000-9999"));
		assertTrue(cMgr.addContact("Bran", "Stark", "", "300-000-9999"));
		assertTrue(cMgr.addContact("Tyrion", "Lannister", "", "100-555-8888"));

		assertEquals(7, cMgr.countContacts());
		assertEquals(3, cMgr.countEqualContacts(
		        new Contact(new Name("Tyrion", "Lannister", ""))));
	}

}