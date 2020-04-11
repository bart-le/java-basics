import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			return false;
		} else {
			myContacts.add(contact);
			return true;
		}
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int oldContactIndex = findContact(oldContact);
		int newContactIndex = findContact(newContact.getName());

		if (oldContactIndex >= 0 && newContactIndex == -1) {
			myContacts.set(oldContactIndex, newContact);
			System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
			return true;
		} else if (newContactIndex >= 0) {
			System.out.println(newContact.getName() + " already exists");
			return false;
		} else {
			return false;
		}
	}

	public boolean removeContact(Contact contact) {
		int index = findContact(contact);

		if (index >= 0) {
			this.myContacts.remove(index);
			System.out.println(contact.getName() + " has been removed");
			return true;
		} else {
			return false;
		}
	}

	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if (contact.getName().equals(contactName))
				return i;
		}

		return -1;
	}

	public Contact queryContact(String name) {
		if (findContact(name) >= 0) {
			return this.myContacts.get(findContact(name));
		} else {
			System.out.println("Contact not found");
			return null;
		}
	}

	public void printContacts() {
		if (myContacts.size() == 0) {
			System.out.println("Contact list empty");
		} else {
			System.out.println("Contact list: ");
			for (int i = 0; i < myContacts.size(); i++)
				System.out.println(
					(i + 1) + ": " +
						myContacts.get(i).getName() + " -> " +
						myContacts.get(i).getPhoneNumber()
				);
		}
	}
}
