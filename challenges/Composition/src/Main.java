public class Main {
	public static void main(String[] args) {
		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("West");
		Wall wall4 = new Wall("South");
		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("Antique", false, 69);

		Bedroom bedroom = new Bedroom("Bart's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();
	}
}
