public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (smallCount >= 0 && bigCount >= 0 && goal >= 0) {
			return smallCount + bigCount * 5 >= goal && smallCount >= goal % 5;
		} else {
			return false;
		}
	}
}
