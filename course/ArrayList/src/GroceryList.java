import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");
		for (int i = 0; i < groceryList.size(); i++)
			System.out.println((i + 1) + ": " + groceryList.get(i));
	}

	public void addGroceryItem(String item) {
		groceryList.add(item);
		System.out.println(item + " has been added to the list.");
	}

	public void modifyGroceryItem(String item, String newItem) {
		int index = findItem(item);
		if (index >= 0)
			modifyGroceryItem(index, newItem);
	}

	private void modifyGroceryItem(int index, String item) {
		groceryList.set(index, item);
		System.out.println("Grocery item " + (index + 1) + " has been modified.");
	}

	public void removeGroceryItem(String item) {
		int index = findItem(item);
		if (index >= 0)
			removeGroceryItem(index);
	}

	private void removeGroceryItem(int index) {
		groceryList.remove(index);
		System.out.println("Grocery item " + (index + 1) + " has been removed.");
	}

	private int findItem(String item) {
		return groceryList.indexOf(item);
	}

	public boolean isOnList(String item) {
		int index = findItem(item);
		return index >= 0;
	}
}
