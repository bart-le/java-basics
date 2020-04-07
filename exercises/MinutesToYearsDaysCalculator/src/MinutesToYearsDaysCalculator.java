public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		long days = minutes / (24 * 60);
		long years = days / 365;
		days = days % 365;

		System.out.println(
			minutes >= 0
				? minutes + " min = " + years + " y and " + days + " d"
				: "Invalid Value"
		);
	}
}
