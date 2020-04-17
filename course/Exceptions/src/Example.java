import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int result = divide();
		System.out.println(result);
	}

	private static int divide() {
		int x, y;

		try {
			x = getInt();
			y = getInt();
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("No suitable input.");
		}

		System.out.println("x: " + x + "; y: " + y);

		try {
			return x / y;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Division by 0 attempt.");
		}
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
