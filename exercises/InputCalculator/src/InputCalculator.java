import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);

		boolean hasNextInt = true;
		int number;
		int count = 0;
		int sum = 0;
		long avg = 0;

		while (hasNextInt) {
			hasNextInt = scanner.hasNextInt();

			if (hasNextInt) {
				number = scanner.nextInt();
				count++;
				sum += number;
				avg = Math.round((double) sum / count);
			} else {
				System.out.println("SUM = " + sum + " AVG = " + avg);
			}
		}
	}
}
