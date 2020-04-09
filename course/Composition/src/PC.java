public class PC {
	private Case casing;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case casing, Monitor monitor, Motherboard motherboard) {
		this.casing = casing;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		casing.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}
}
