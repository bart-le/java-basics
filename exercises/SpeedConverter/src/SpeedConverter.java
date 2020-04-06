public class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(kilometersPerHour / 1.609);
		}
	}

	public static void printConversion(double kilometersPerHour) {
		System.out.println(
			kilometersPerHour < 0
				? "Invalid Value"
				: kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h"
		);
	}
}
