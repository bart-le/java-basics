public class Main {
	public static void main(String[] args) {
		BasketballPlayer allen = new BasketballPlayer("Allen Iverson");
		SoccerPlayer leo = new SoccerPlayer("Leo Messi");
		BaseballPlayer derek = new BaseballPlayer("Derek Jeter");

		Team<BasketballPlayer> sixers = new Team<>("Philadelphia 76ers");
		sixers.addPlayer(allen);
		System.out.println(sixers.numPlayers());

		Team<SoccerPlayer> baseballTeam = new Team<>("FC Barcelona");
		baseballTeam.addPlayer(leo);

		Team<BaseballPlayer> brokenTeam = new Team<>("this won't work");
		brokenTeam.addPlayer(derek);

		Team<BasketballPlayer> celtics = new Team<>("Boston Celtics");
		Team<BasketballPlayer> bulls = new Team<>("Chicago Bulls");
		Team<BasketballPlayer> lakers = new Team<>("Los Angeles Lakers");
		BasketballPlayer leBron = new BasketballPlayer("LeBron James");
		lakers.addPlayer(leBron);

		celtics.matchResult(bulls, 111, 104);
		celtics.matchResult(sixers, 109, 98);
		sixers.matchResult(bulls, 100, 89);

		System.out.println("Rankings:");
		System.out.println(sixers.getName() + ": " + sixers.ranking());
		System.out.println(lakers.getName() + ": " + lakers.ranking());
		System.out.println(bulls.getName() + ": " + bulls.ranking());
		System.out.println(celtics.getName() + ": " + celtics.ranking());

		System.out.println(sixers.compareTo(lakers));
		System.out.println(sixers.compareTo(celtics));
		System.out.println(celtics.compareTo(sixers));
		System.out.println(lakers.compareTo(bulls));
	}
}
