public class LargestPrime {
	public static int getLargestPrime(int number) {
		if (number > 1) {
			int largestPrime = 2;
			for (int i = 2; i <= number; i++) {
				boolean isPrime = true;
				int j = 2;
				while (isPrime && j < i) {
					if (i % j == 0) isPrime = false;
					j++;
				}

				if (isPrime && number % i == 0) largestPrime = i;
			}

			return largestPrime;
		} else {
			return -1;
		}
	}
}
