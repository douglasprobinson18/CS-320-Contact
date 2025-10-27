package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {


	@Test
	void contractCreationTest() {
		//0 or less tests
		assertTrue(Contact.createContact("","a","a","1","a") == null);
		assertTrue(Contact.createContact("a","","a","1","a") == null);
		assertTrue(Contact.createContact("a","a","","1","a") == null);
		assertTrue(Contact.createContact("a","a","a","","a") == null);
		assertTrue(Contact.createContact("a","a","a","1","") == null);
		//null tests
		assertTrue(Contact.createContact(null,"a","a","1","a") == null);
		assertTrue(Contact.createContact("a",null,"a","1","a") == null);
		assertTrue(Contact.createContact("a","a",null,"1","a") == null);
		assertTrue(Contact.createContact("a","a","a",null,"a") == null);
		assertTrue(Contact.createContact("a","a","a","1",null) == null);
		//11 or more tests
		assertTrue(Contact.createContact("aaaaaaaaaaa","a","a","1","a") == null);
		assertTrue(Contact.createContact("a","aaaaaaaaaaa","a","1","a") == null);
		assertTrue(Contact.createContact("a","a","aaaaaaaaaaa","1","a") == null);
		assertTrue(Contact.createContact("a","a","a","11111111111","a") == null);
		//31 or more test
		assertTrue(Contact.createContact("a","a","a","1","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa") == null);
        //digits only test
		assertTrue(Contact.createContact("a","a","a","a","a") == null);
		//correct test
		assertFalse(Contact.createContact("a","a","a","1","a") == null);
	}
	@Test
	void setFirstNameTest() {
		Contact contract1 = Contact.createContact("1", "John", "Smith", "2223334444", "123 park st");
		//0 test
		assertFalse(contract1.setFirstName(""));
		//null test
		assertFalse(contract1.setFirstName(null));
		//11 or more test
		assertFalse(contract1.setFirstName("aaaaaaaaaaa"));
		//success test
		contract1.setFirstName("bob");
		assertTrue(contract1.getFirstName().equals("bob"));
	}
	@Test
	void setLastNameTest() {
		Contact contract1 = Contact.createContact("1", "John", "Smith", "2223334444", "123 park st");
		
		//0 test
		assertFalse(contract1.setLastName(""));
		//null test
		assertFalse(contract1.setLastName(null));
		//11 or more test
		assertFalse(contract1.setLastName("aaaaaaaaaaa"));
		//success test
		contract1.setLastName("bob");
		assertTrue(contract1.getLastName().equals("bob"));
	}
	@Test
	void setPhoneTest() {
		Contact contract1 = Contact.createContact("1", "John", "Smith", "2223334444", "123 park st");
		//0 test
		assertFalse(contract1.setPhone(""));
		//null test
		assertFalse(contract1.setPhone(null));
		//11 or more test
		assertFalse(contract1.setPhone("11111111111"));
		//digit test
		assertFalse(contract1.setPhone("1d11111111"));
		//success test
		contract1.setPhone("2");
		assertTrue(contract1.getPhone().equals("2"));
	}
	@Test
	void setAddressTest() {
		Contact contract1 = Contact.createContact("1", "John", "Smith", "2223334444", "123 park st");
		//0 test
		assertFalse(contract1.setAddress(""));
		//null test
		assertFalse(contract1.setAddress(null));
		//31 or more test
		assertFalse(contract1.setAddress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		//success test
		contract1.setAddress("asd");
		assertTrue(contract1.getAddress().equals("asd"));
	}
}
