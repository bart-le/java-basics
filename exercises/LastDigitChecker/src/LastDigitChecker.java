public class LastDigitChecker {
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {
		if (isValid(number1) && isValid(number2) && isValid(number3)) {
			boolean isEqual12 = number1 % 10 == number2 % 10;
			boolean isEqual13 = number1 % 10 == number3 % 10;
			boolean isEqual23 = number2 % 10 == number3 % 10;
			return isEqual12 || isEqual13 || isEqual23;
		} else {
			return false;
		}
	}

	public static boolean isValid(int number) {
		return number >= 10 && number <= 1000;
	}
}
