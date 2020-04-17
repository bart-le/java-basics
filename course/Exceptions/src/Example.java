import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		try {
			int result = divide();
			System.out.println(result);
		} catch (ArithmeticException | NoSuchElementException e) {
			System.out.println(e.toString());
			System.out.println("Unable to perform division. That's some advanced mathematics.");
		}
	}

	private static int divide() {
		int x = getInt();
		int y = getInt();

		System.out.println("x: " + x + "; y: " + y);
		return x / y;
	}

	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");

		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Enter a number from 0 to 9:");
			}
		}
	}
}
