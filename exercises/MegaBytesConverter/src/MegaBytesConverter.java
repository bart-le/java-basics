public class MegaBytesConverter {
	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		System.out.println(
			kilobytes < 0
				? "Invalid Value"
				: kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB"
		);
	}
}
