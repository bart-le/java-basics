public class Main {
	public static void main(String[] args) {
		System.out.println("Main method called");
		StaticInitializationBlock sib = new StaticInitializationBlock();
		sib.someMethod();
		System.out.println("Owner is " + StaticInitializationBlock.owner);
	}
}
