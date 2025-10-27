package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.ContactService;

class ContractServiceTest {

	@Test
	void addTest() {
		ContactService.addContract("1", "John", "Smith", "2223334444", "123 park st");
		assertTrue(ContactService.getContract("1") != null);
	}
	@Test
	void deleteTest() {
		ContactService.addContract("1", "John", "Smith", "2223334444", "123 park st");
		//Embarrassing I forgot to delete
		ContactService.deleteContract("1");
		assertTrue(ContactService.getContract("1") == null);
	}
	@Test
	void updateTest() {
		ContactService.addContract("1", "John", "Smith", "2223334444", "123 park st");
		
		ContactService.editFirstName("1", "bob");
		assertTrue(ContactService.getContract("1").getFirstName().equals("bob"));
		ContactService.editLastName("1", "bob");
		assertTrue(ContactService.getContract("1").getLastName().equals("bob"));
		ContactService.editNumber("1", "77");
		assertTrue(ContactService.getContract("1").getPhone().equals("77"));
		ContactService.editAddress("1", "bob");
		assertTrue(ContactService.getContract("1").getAddress().equals("bob"));
	}

}
