import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for (int i = 1; i <= 100; i++) {
			squares.add(i * i);
			cubes.add(i * i * i);
		}

		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("Union contains " + union.size() + " elements");

		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("Intersection contains " + intersection.size() + " elements");
		for (Integer i : intersection)
			System.out.println(i + " is the square root of " + Math.sqrt(i) + " and " + Math.cbrt(i));

		Set<String> words = new HashSet<>();
		String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
		String[] wordsArray = sentence.split(" ");
		words.addAll(Arrays.asList(wordsArray));
		for (String word : words)
			System.out.println(word);

		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();
		String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
		String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
		nature.addAll(Arrays.asList(natureWords));
		divine.addAll(Arrays.asList(divineWords));

		System.out.println("nature - divine:");
		Set<String> diff1 = new HashSet<>(nature);
		diff1.removeAll(divine);
		printSet(diff1);

		System.out.println("divine - nature:");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature);
		printSet(diff2);

		Set<String> natureDivineUnion = new HashSet<>(nature);
		natureDivineUnion.addAll(divine);
		Set<String> natureDivineIntersection = new HashSet<>(nature);
		natureDivineIntersection.retainAll(divine);

		System.out.println("Symmetric difference:");
		natureDivineUnion.removeAll(natureDivineIntersection);
		printSet(natureDivineUnion);

		if (nature.containsAll(divine))
			System.out.println("divine is a subset of nature");

		if (nature.containsAll(natureDivineIntersection))
			System.out.println("natureDivineIntersection is a subset of nature");

		if (divine.containsAll(natureDivineIntersection))
			System.out.println("natureDivineIntersection is a subset of divine");
	}

	private static void printSet(Set<String> set) {
		System.out.print("\t");
		for (String s : set)
			System.out.print(s + " ");
		System.out.println();
	}
}
