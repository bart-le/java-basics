import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter count: ");
		int count = scanner.nextInt();

		int[] array = readIntegers(count);
		System.out.print("Minimum: " + findMin(array));
	}

	private static int[] readIntegers(int count) {
		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = scanner.nextInt();
		}

		return array;
	}

	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++)
			if (array[i] < min) min = array[i];

		return min;
	}
}
