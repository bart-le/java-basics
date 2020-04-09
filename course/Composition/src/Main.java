public class Main {
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case casing = new Case("420", "Dell", "240", dimensions);
		Monitor monitor = new Monitor("SomeMonitor Model", "Acer", 27, new Resolution(2540, 1440));
		Motherboard motherboard = new Motherboard("1337XD", "MSI", 4, 6, "2.44");

		PC pc = new PC(casing, monitor, motherboard);
		pc.powerUp();
	}
}
