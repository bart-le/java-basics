public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if (number >= 0) {
			int sum = 0, lastDigit;
			while (number != 0) {
				lastDigit = number % 10;
				if (lastDigit % 2 == 0) sum += lastDigit;
				number /= 10;
			}
			return sum;
		} else {
			return -1;
		}
	}
}