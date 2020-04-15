public class Main {
	public static void main(String[] args) {
		SomeClass one = new SomeClass("one");
		SomeClass two = new SomeClass("two");
		SomeClass three = new SomeClass("three");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());

		int pass = 12345;
		Password password = new ExtendedPassword(pass);
		password.storePassword();

		password.login(123456789);
		password.login(1234);
		password.login(4343);
		password.login(12345);
	}
}
