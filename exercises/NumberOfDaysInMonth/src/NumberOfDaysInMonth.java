public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) return false;

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12 || year < 1 || year > 9999) return -1;

		int days;
		switch (month) {
			case 2:
				days = isLeapYear(year) ? 29 : 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				days = 31;
				break;
		}
		return days;
	}
}
