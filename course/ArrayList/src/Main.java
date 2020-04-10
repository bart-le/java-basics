import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice;
		printInstructions();

		while (!quit) {
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					processArrayList();
					break;
				case 7:
					quit = true;
					break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("Press:");
		System.out.println("\t0 - print choice options");
		System.out.println("\t1 - print list of the grocery items");
		System.out.println("\t2 - add an item to the list");
		System.out.println("\t3 - modify an item in the list");
		System.out.println("\t4 - remove an item from the list");
		System.out.println("\t5 - search for an item in the list");
		System.out.println("\t6 - quit");
	}

	public static void addItem() {
		System.out.print("[+] Enter the grocery item: ");

		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.print("[~] Enter item name: ");
		String item = scanner.nextLine();
		System.out.print("[~] Enter new item name: ");
		String newItem = scanner.nextLine();

		groceryList.modifyGroceryItem(item, newItem);
	}

	public static void removeItem() {
		System.out.print("[-] Enter item name: ");
		String item = scanner.nextLine();

		groceryList.removeGroceryItem(item);
	}

	public static void searchForItem() {
		System.out.print("[?] Item to search for: ");
		String item = scanner.nextLine();

		if (groceryList.isOnList(item)) {
			System.out.println("[?] Found " + item + " in your grocery list.");
		} else {
			System.out.println("[?] " + item + " is not in the shopping list.");
		}
	}

	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());

		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

		String[] array = new String[groceryList.getGroceryList().size()];
		array = groceryList.getGroceryList().toArray(array);
	}
}
