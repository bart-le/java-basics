public class Main {
	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Bart", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Felix", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Xavier", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("James", highScorePosition);
	}

	public static void displayHighScorePosition(String player, int position) {
		System.out.println(player + " managed to get into position " + position + " on the high score table.");
	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000) {
			return 1;
		} else if (score >= 500) {
			return 2;
		} else if (score >= 100) {
			return 3;
		} else {
			return 4;
		}
	}
}
