public class Main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympian", 8, 12);
		theatre.getSeats();
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay for the seat");
		} else {
			System.out.println("Seat taken");
		}
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay for the seat");
		} else {
			System.out.println("Seat taken");
		}
	}
}
