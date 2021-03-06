import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Locations locations = new Locations();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, String> directions = new HashMap<>();
		directions.put("NORTH", "N");
		directions.put("EAST", "E");
		directions.put("WEST", "W");
		directions.put("SOUTH", "S");
		directions.put("QUIT", "Q");

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc == 0) break;

			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are: ");
			for (String exit : exits.keySet())
				System.out.print(exit + " ");
			System.out.println();

			String direction = scanner.nextLine().toUpperCase();
			if (direction.length() > 1) {
				for (String word : direction.split(" "))
					if (directions.containsKey(word))
						direction = directions.get(word);
			}

			if (exits.containsKey(direction))
				loc = exits.get(direction);
			else
				System.out.println("You cannot go in that direction");
		}
	}
}
