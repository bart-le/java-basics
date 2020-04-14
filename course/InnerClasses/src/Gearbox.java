import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean isClutchIn;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);

		for (int i = 0; i < maxGears; i++) {
			addGear(i, i * 5.3);
		}
	}

	public void operateClutch(boolean in) {
		this.isClutchIn = in;
	}

	public void addGear(int number, double ratio) {
		if (number > 0 && number <= maxGears) {
			this.gears.add(new Gear(number, ratio));
		}
	}

	public void changeGear(int newGear) {
		if (newGear >= 0 && newGear < this.gears.size() && this.isClutchIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Grind");
		}
	}

	public double wheelSpeed(int revs) {
		if (isClutchIn) {
			System.out.println("Nope");
			return 0.0;
		} else {
			return revs * gears.get(currentGear).getRatio();
		}
	}

	private class Gear {
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public int getGearNumber() {
			return gearNumber;
		}

		public double getRatio() {
			return ratio;
		}

		public double driveSpeed(int revs) {
			return revs * this.ratio;
		}
	}
}
