public class StaticInitializationBlock {
	public static final String owner;

	static {
		owner = "Bart";
		System.out.println("First static initialization block called");
	}

	public StaticInitializationBlock() {
		System.out.println("StaticInitializationBlock constructor called");
	}

	static {
		System.out.println("Second static initialization block called");
	}

	public void someMethod() {
		System.out.println("someMethod() called");
	}
}
