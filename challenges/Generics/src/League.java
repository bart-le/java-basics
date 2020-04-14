import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	private String name;
	private ArrayList<T> league = new ArrayList<>();

	public League(String name) {
		this.name = name;
	}

	public boolean addTeam(T team) {
		if (league.contains(team)) {
			System.out.println("Team already added in the league");
			return false;
		} else {
			league.add(team);
			return true;
		}
	}

	public void showLeagueTable() {
		Collections.sort(league);
		for (T team : league) {
			System.out.println(team.getName() + ": " + team.ranking());
		}
	}
}
