import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Player bart = new Player("Bart", 100, 300);
		System.out.println(bart.toString());
		saveObject(bart);
		bart.setHitPoints(150);
		System.out.println(bart);
		bart.setWeapon("lightsaber");
		saveObject(bart);
		loadObject(bart);
		System.out.println(bart);

		ISavable zombie = new Monster("Zombie", 20, 30);
		System.out.println("Strength: " + ((Monster) zombie).getStrength());
		saveObject(zombie);
	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Available choices:");
		System.out.println("\t1 - enter a string");
		System.out.println("\t0 - quit");

		while (!quit) {
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.print("Enter a string: ");
					String stringInput = scanner.nextLine();
					values.add(index, stringInput);
					index++;
					break;
			}
		}
		return values;
	}

	public static void saveObject(ISavable objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i));
		}
	}

	public static void loadObject(ISavable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
