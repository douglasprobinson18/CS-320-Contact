package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private static Map<String,Contact> contacts = new HashMap<>();
	
	public static boolean addContract(String id, String firstName, String lastName, String phone, String address) {
		Contact contact = Contact.createContact(id,firstName,lastName,phone,address);
		if (contact == null || contacts.containsKey(id)) {
			return false;
		}
		contacts.put(id, contact);
		return true;
	}
	public static boolean deleteContract(String id) {
		if (!contacts.containsKey(id)) {
			return false;
		}
		contacts.remove(id);
		return true;
	}
	public static boolean editFirstName(String id, String firstName) {
		return contacts.get(id).setFirstName(firstName);
	}
	public static boolean editLastName(String id, String lastName) {
		return contacts.get(id).setLastName(lastName);
	}
	public static boolean editNumber(String id, String phone) {
		return contacts.get(id).setPhone(phone);
	}
	public static boolean editAddress(String id, String address) {
		return contacts.get(id).setAddress(address);
	}	
	public static Contact getContract(String id) {
		return contacts.get(id);
	}
}
