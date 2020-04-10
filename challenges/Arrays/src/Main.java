import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		printArray(sortIntegers(myIntegers));
	}

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];

		System.out.println("Enter " + capacity + " integer values:");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();

		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println("Element " + i + ": " + array[i]);
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++)
			sortedArray[i] = array[i];

		int i = 0;
		int temp;
		boolean swapped;
		do {
			swapped = false;
			for (int j = 0; j < sortedArray.length - i - 1; j++)
				if (sortedArray[j] < sortedArray[j + 1]) {
					temp = sortedArray[j];
					sortedArray[j] = sortedArray[j + 1];
					sortedArray[j + 1] = temp;
					swapped = true;
				}

			i++;
		} while (swapped);

		return sortedArray;
	}
}
