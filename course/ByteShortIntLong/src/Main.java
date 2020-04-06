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

		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long minimum value: " + myMinLongValue);
		System.out.println("Long maximum value: " + myMaxLongValue);

		long bigLongLiteralValue = 2_147_483_6470L;
		System.out.println(bigLongLiteralValue);
	}
}
