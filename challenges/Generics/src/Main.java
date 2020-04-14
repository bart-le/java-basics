public class Main {
	public static void main(String[] args) {
		League<Team<BasketballPlayer>> nba = new League<>("NBA");
		Team<BasketballPlayer> sixers = new Team<>("Philadelphia 76ers");
		Team<BasketballPlayer> lakers = new Team<>("Los Angeles Lakers");
		Team<BasketballPlayer> celtics = new Team<>("Boston Celtics");
		Team<BasketballPlayer> bulls = new Team<>("Chicago Bulls");
		Team<SoccerPlayer> barca = new Team<>("FC Barcelona");

		nba.addTeam(sixers);
		nba.addTeam(lakers);
		nba.addTeam(celtics);
		nba.addTeam(bulls);

		celtics.matchResult(bulls, 111, 104);
		celtics.matchResult(sixers, 109, 98);
		sixers.matchResult(bulls, 100, 89);

		nba.showLeagueTable();
	}
}
