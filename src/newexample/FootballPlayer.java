
package newexample;

class FootballPlayer implements Cloneable {
	String name;
	String position;
	Team team; 

	public FootballPlayer(String name, String position, Team team) {
		this.name = name;
		this.position = position;
		this.team = team;
	}

	@Override
	protected FootballPlayer clone() throws CloneNotSupportedException {
		FootballPlayer deepClone = (FootballPlayer) super.clone(); // Perform shallow copy
		deepClone.team = this.team.clone(); // deep copy
		return deepClone;
	}

}
