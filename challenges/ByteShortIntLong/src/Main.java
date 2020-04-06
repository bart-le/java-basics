public class Main {
	public static void main(String[] args) {
		byte byteVar = 69;
		short shortVar = 420;
		int intVar = 213700;

		long longVar = 50000L + 10 * ((byteVar + shortVar + intVar));
		System.out.println(longVar);
	}
}
