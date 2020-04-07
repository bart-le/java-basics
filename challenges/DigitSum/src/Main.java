public class Main {
	public static void main(String[] args) {
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(-3));
		System.out.println(sumDigits(0));
	}

	public static int sumDigits(int number) {
		if (number >= 10) {
			int sum = 0;
			while (number != 0) {
				System.out.println(number);
				sum += number % 10;
				number /= 10;
			}
			return sum;
		} else {
			return -1;
		}
	}
}
