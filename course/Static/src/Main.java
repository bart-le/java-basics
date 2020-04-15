public class Main {
	public static int multiplier = 3;

	public static void main(String[] args) {
		StaticTest firstInstance = new StaticTest("1st instance");
		System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getInstanceCount());
		StaticTest secondInstance = new StaticTest("2nd instance");
		System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getInstanceCount());
		StaticTest thirdInstance = new StaticTest("3rd instance");
		System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getInstanceCount());

		int answer = multiply(6);
		System.out.println("Multiplier: " + multiplier);
		System.out.println("Answer: " + answer);
	}

	public static int multiply(int number) {
		return number * multiplier;
	}
}
