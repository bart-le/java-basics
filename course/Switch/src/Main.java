public class Main {
	public static void main(String[] args) {
		int value = 3;
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}

		int switchValue = 3;
		switch (switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Value was 3, 4 or 5");
				System.out.println("Actually it was " + switchValue);
				break;
			default:
				System.out.println("Was not 1 or 2");
		}

		char c = 'X';
		switch (c) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
				System.out.println("Found char: " + c);
				break;
			default:
				System.out.println("No match");
				break;
		}

		String month = "MARCH";
		switch (month.toLowerCase()) {
			case "march":
				System.out.println("Mar");
				break;
			case "april":
				System.out.println("Apr");
				break;
			default:
				System.out.println("Not specified");
		}
	}
}
