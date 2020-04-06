public class Main {
	public static void main(String[] args) {
		int myValue = 10000;

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value: " + myMinByteValue);
		System.out.println("Byte maximum value: " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short minimum value: " + myMinShortValue);
		System.out.println("Short maximum value: " + myMaxShortValue);

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer minimum value: " + myMinIntValue);
		System.out.println("Integer maximum value: " + myMaxIntValue);

		System.out.println("Busted MIN_VALUE value: " + (myMinIntValue - 1));
		System.out.println("Busted MAX_VALUE value: " + (myMaxIntValue + 1));
	}
}
