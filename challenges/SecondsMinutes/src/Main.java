public class Main {
	public static void main(String[] args) {
		System.out.println(getDurationString(100, 42));
		System.out.println(getDurationString(-100, 42));
		System.out.println(getDurationString(2115));
		System.out.println(getDurationString(12));
	}

	public static String getDurationString(long minutes, long seconds) {
		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
			long hours = minutes / 60;
			minutes = minutes % 60;
			return (hours < 10 ? "0" + hours : hours) + "h"
				+ (minutes < 10 ? "0" + minutes : minutes) + "m"
				+ (seconds < 10 ? "0" + seconds : seconds) + "s";
		} else {
			return "Invalid parameters.";
		}
	}

	public static String getDurationString(long seconds) {
		if (seconds >= 0) {
			long minutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minutes, seconds);
		} else {
			return "Invalid parameters.";
		}
	}
}
