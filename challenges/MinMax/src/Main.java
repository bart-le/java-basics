import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		boolean hasNextInt = true;
		boolean first = false;

		while (hasNextInt) {
			System.out.println("Enter a number:");
			hasNextInt = scanner.hasNextInt();

			if (hasNextInt) {
				number = scanner.nextInt();

				if (first) {
					min = Math.min(number, min);
					max = Math.max(number, max);
				} else {
					first = true;
					min = number;
					max = number;
				}
			} else {
				System.out.println("min: " + min + "; max: " + max);
			}
		}

		scanner.close();
	}
}
