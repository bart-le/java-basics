public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first >= 10 && second >= 10) {
			int temp;
			while (second != 0) {
				temp = first % second;
				first = second;
				second = temp;
			}
			return first;
		} else {
			return -1;
		}
	}
}
