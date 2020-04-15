import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympian", 8, 12);
		List<Theatre.Seat> shallowCopy = new ArrayList<>(theatre.seats);
		printList(shallowCopy);

		shallowCopy.get(1).reserve();
		if (theatre.reserveSeat("A02")) {
			System.out.println("Please pay for seat A02");
		} else {
			System.out.println("Seat taken");
		}

		Collections.shuffle(shallowCopy);
		System.out.println("List<Theatre.Seat> seatCopy:");
		printList(shallowCopy);
		System.out.println("List<Theatre.Seat> theatre.seats:");
		printList(theatre.seats);

		Theatre.Seat minSeat = Collections.min(shallowCopy);
		Theatre.Seat maxSeat = Collections.max(shallowCopy);
		System.out.println("Collections.min(shallowCopy).getSeatNumber(): " + minSeat.getSeatNumber());
		System.out.println("Collections.max(shallowCopy).getSeatNumber(): " + maxSeat.getSeatNumber());

		sortList(shallowCopy);
		System.out.println("sortList(shallowCopy);");
		printList(shallowCopy);
	}

	public static void printList(List<Theatre.Seat> list) {
		for (Theatre.Seat seat : list)
			System.out.print(seat.getSeatNumber() + " ");
		System.out.println("\n------");
	}

	public static void sortList(List<? extends Theatre.Seat> list) {
		for (int i = 0; i < list.size() - 1; i++)
			for (int j = 0; j < list.size(); j++)
				if (list.get(i).compareTo(list.get(j)) > 0)
					Collections.swap(list, i, j);
	}
}
