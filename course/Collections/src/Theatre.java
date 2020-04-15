import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private final String theatreName;
	public List<Seat> seats = new ArrayList<>();

	public Theatre(String theatreName, int rows, int seatsPerRow) {
		this.theatreName = theatreName;
		int lastRow = 'A' + (rows - 1);

		for (char row = 'A'; row <= lastRow; row++)
			for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
				Seat seat = new Seat(row + String.format("%02d", seatNumber));
				seats.add(seat);
			}
	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		int low = 0;
		int high = seats.size() - 1;

		while (low <= high) {
			System.out.print("- ");
			int mid = (low + high) / 2;
			Seat midValue = seats.get(mid);
			int comparison = midValue.getSeatNumber().compareTo(seatNumber);

			if (comparison < 0) {
				low = mid + 1;
			} else if (comparison > 0) {
				high = mid - 1;
			} else {
				return seats.get(mid).reserve();
			}
		}

		System.out.println("There is no seat " + seatNumber);
		return false;
	}

	public void getSeats() {
		for (Seat seat : seats)
			System.out.println(seat.getSeatNumber());
	}

	public class Seat implements Comparable<Seat> {
		private final String seatNumber;
		private boolean reserved = false;

		private Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved");
				return true;
			} else {
				return false;
			}
		}

		public boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Reservation for seat " + seatNumber + " cancelled");
				return true;
			} else {
				return false;
			}
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
	}
}
