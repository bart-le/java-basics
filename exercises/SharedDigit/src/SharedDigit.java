public class SharedDigit {
	public static boolean hasSharedDigit(int number1, int number2) {
		if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) {
			int lastDigit;
			boolean isEqual = false;
			while (number1 != 0) {
				lastDigit = number1 % 10;
				isEqual = lastDigit == number2 % 10 || lastDigit == number2 / 10;
				if (isEqual) break;
				number1 /= 10;
			}
			return isEqual;
		} else {
			return false;
		}
	}
}
