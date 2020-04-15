import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();

		if (languages.containsKey("Java")) {
			System.out.println("Java key exists");
		} else {
			languages.put("Java", "statically typed, class-based, object-oriented");
			System.out.println("Key added successfully");
		}

		languages.put("Java", "not JavaScript");
		System.out.println(languages.get("Java"));

		languages.put("Brainfuck", "minimalistic");
		languages.put("HTML", "not a programming language");

		System.out.println(languages.put("JavaScript", "dynamically typed, prototype-based object-orientation"));
		System.out.println(languages.put("COBOL", "dinosaur language"));

		if (languages.containsKey("Java")) {
			System.out.println("Java key is already in the map");
		} else {
			languages.put("Java", "not JavaScript");
		}

		if (languages.remove("COBOL", "dinosaur language")) {
			System.out.println("COBOL removed");
		} else {
			System.out.println("COBOL not removed, key/value pair not found");
		}

		if (languages.replace("HTML", "not a programming language", "hypertext markup language")) {
			System.out.println("HTML replaced");
		} else {
			System.out.println("HTML not replaced");
		}

		System.out.println(languages.replace("Scala", "won't be replaced, no such key"));

		for (String key : languages.keySet())
			System.out.println(key + ": " + languages.get(key));
	}
}
