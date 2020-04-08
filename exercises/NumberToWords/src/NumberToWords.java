public class NumberToWords {
	public static void numberToWords(int number) {
		int reversed = reverse(number);
		int originalDigitCount = getDigitCount(number);
		int reversedDigitCount = getDigitCount(reversed);

		if (reversed >= 0) {
			for (int i = 0; i < reversedDigitCount; i++) {
				String word = "";
				switch (reversed % 10) {
					case 0:
						word = "Zero";
						break;
					case 1:
						word = "One";
						break;
					case 2:
						word = "Two";
						break;
					case 3:
						word = "Three";
						break;
					case 4:
						word = "Four";
						break;
					case 5:
						word = "Five";
						break;
					case 6:
						word = "Six";
						break;
					case 7:
						word = "Seven";
						break;
					case 8:
						word = "Eight";
						break;
					case 9:
						word = "Nine";
						break;
				}

				reversed /= 10;
				System.out.println(word);
			}

			if (reversedDigitCount != originalDigitCount)
				for (int i = 0; i < originalDigitCount - reversedDigitCount; i++)
					System.out.println("Zero");
		} else {
			System.out.println("Invalid Value");
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		int lastDigit;
		while (number != 0) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number /= 10;
		}

		return reverse;
	}

	public static int getDigitCount(int number) {
		if (number >= 0) {
			int count = 0;
			do {
				count++;
				number /= 10;
			} while (number != 0);

			return count;
		} else {
			return -1;
		}
	}
}
