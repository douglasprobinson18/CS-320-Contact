package contact;

//Refactored the name from contract to contact (it was very tedious)
public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	private Contact(String id, String firstName, String lastName, String phone, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public static Contact createContact(String id, String firstName, String lastName, String phone, String address) {
		if(id == null || firstName == null || lastName == null || phone == null || address == null) {
			return null;
		}
		if(id.length() <= 0 || id.length() > 10) {
			return null;
		}
		if(firstName.length() <= 0 || firstName.length() > 10) {
			return null;
		}
		if(lastName.length() <= 0 || lastName.length() > 10) {
			return null;
		}
		if(phone.length() <= 0 || phone.length() > 10) {
			return null;
		}
		String test = phone;
		for (char d : test.toCharArray()) {
			if (!Character.isDigit(d)) {
				return null;
			}
		}
		if(address.length() <= 0 || address.length() > 30) {
			return null;
		}
		return new Contact(id,firstName,lastName,phone,address);
	}
	public boolean setFirstName(String firstName) {
		if(firstName == null) {
			return false;
		}
		if(firstName.length() <= 0 || firstName.length() > 10) {
			return false;
		}
		this.firstName = firstName;
		return true;
	}
	public boolean setLastName(String lastName) {
		if (lastName == null) {
			return false;
		}
		if(lastName.length() <= 0 || lastName.length() > 10) {
			return false;
		}
		this.lastName = lastName;
		return true;
	}
	public boolean setPhone(String phone) {
		if (phone == null) {
			return false;
		}
		if(phone.length() <= 0 || phone.length() > 10 ) {
			return false;
		}
		String test = phone;
		for (char d : test.toCharArray()) {
			if (!Character.isDigit(d)) {
				return false;
			}
		}
		this.phone = phone;
		return true;
	}
	public boolean setAddress(String address) {
		if (address == null) {
			return false;
		}
		if(address.length() <= 0 || address.length() > 30 ) {
			return false;
		}
		this.address = address;
		return true;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getAddress() {
		return this.address;
	}
}
