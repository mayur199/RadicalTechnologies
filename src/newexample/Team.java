package newexample;

public class Team {
	String teamName;

	public Team(String teamName) {
		this.teamName = teamName;
	}

	// Deep copy method for Team
	public Team clone() {
		return new Team(this.teamName);
	}

}
