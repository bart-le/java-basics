public class Main {
	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(5, 8);
		calcFeetAndInchesToCentimeters(30);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double centimeters = (feet >= 0 && inches >= 0 && inches <= 12)
			? feet * 12 * 2.54 + inches * 2.54
			: -1;

		System.out.println(
			centimeters != -1
				? feet + " ft " + inches + " in = " + centimeters + " cm"
				: "Invalid parameters."
		);
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		int feet = (int) (inches / 12);
		int recalculatedInches = (int) inches % 12;

		System.out.println(inches + " in = " + feet + " ft " + recalculatedInches + " in");
		return inches >= 0
			? calcFeetAndInchesToCentimeters(feet, recalculatedInches)
			: -1;
	}
}
