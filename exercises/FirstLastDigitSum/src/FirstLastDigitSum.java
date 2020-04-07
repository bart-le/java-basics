public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		if (number >= 0) {
			int firstDigit = number, lastDigit = number;
			while (firstDigit >= 10)
				firstDigit /= 10;
			lastDigit %= 10;

			return firstDigit + lastDigit;
		} else {
			return -1;
		}
	}
}
