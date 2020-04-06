public class Main {
	public static void main(String[] args) {
		String myString = "string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2019";
		System.out.println("myString is equal to " + myString);

		String numberString = "21.37";
		numberString = numberString + "420.69";
		System.out.println(numberString);
		String lastString = "21";
		int myInt = 37;
		lastString = lastString + myInt;

		System.out.println("lastString is equal to " + lastString);
		double doubleNumber = 13.37d;
		lastString = lastString + doubleNumber;
		System.out.println("lastString is equal to " + lastString);
	}
}
