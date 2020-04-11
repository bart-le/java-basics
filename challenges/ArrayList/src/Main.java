import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("22 536 36 36");

	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();

		while (!quit) {
			System.out.print("Enter action (6 - available actions): ");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
				case 0:
					System.out.println("Shutting down...");
					quit = true;
					break;
				case 1:
					mobilePhone.printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printActions();
					break;
			}
		}
	}

	private static void startPhone() {
		System.out.println("Turning on...");
	}

	private static void printActions() {
		System.out.println("Press:");
		System.out.println("\t0 - shut down");
		System.out.println("\t1 - print contacts");
		System.out.println("\t2 - add contact");
		System.out.println("\t3 - update contact");
		System.out.println("\t4 - remove contact");
		System.out.println("\t5 - query if exists");
		System.out.println("\t6 - print available actions");
		System.out.print("Choose your action: ");
	}

	private static void addNewContact() {
		System.out.print("[+] Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.print("[+] Enter phone number: ");
		String phoneNumber = scanner.nextLine();

		Contact newContact = Contact.createContact(name, phoneNumber);
		System.out.println(
			mobilePhone.addNewContact(newContact)
				? "New contact: " + name + " -> " + phoneNumber
				: name + " already exists in your contact list"
		);
	}

	private static void updateContact() {
		System.out.print("[~] Enter existing contact name: ");
		String name = scanner.nextLine();

		System.out.print("[~] Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.print("[~] Enter new phone number: ");
		String newPhoneNumber = scanner.nextLine();

		Contact existingContact = mobilePhone.queryContact(name);
		Contact newContact = Contact.createContact(newName, newPhoneNumber);
		System.out.println(
			mobilePhone.updateContact(existingContact, newContact)
				? "Successfully updated record"
				: "Error updating record"
		);
	}

	private static void removeContact() {
		System.out.print("[-] Enter existing contact name: ");
		String name = scanner.nextLine();

		Contact existingContact = mobilePhone.queryContact(name);
		System.out.println(
			mobilePhone.removeContact(existingContact)
				? "Successfully deleted record"
				: "Error deleting record"
		);
	}

	private static void queryContact() {
		System.out.print("[?] Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);

		if (existingContact != null)
			System.out.println(
				"Name: " + existingContact.getName() +
					" -> " + existingContact.getPhoneNumber()
			);
	}
}
