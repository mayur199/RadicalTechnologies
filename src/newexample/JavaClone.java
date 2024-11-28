package newexample;

public class JavaClone {
	public static void main(String[] args) throws CloneNotSupportedException {
        // Original Player
        Team originalTeam = new Team("Real Madrid");
        FootballPlayer originalPlayer = new FootballPlayer("Ronaldo", "Striker", originalTeam);

        // Clone the Player
        FootballPlayer clonedPlayer = originalPlayer.clone();

        // Modify the cloned object's team name
        clonedPlayer.team.teamName = "Manchester United";

        // Display details
        System.out.println("Original Player Name: " + originalPlayer.name);
		System.out.println("Original Player Position: " + originalPlayer.position);
		System.out.println("Cloned Player Name: " + clonedPlayer.name);
		System.out.println("Cloned Player Position: " + clonedPlayer.position);
        System.out.println("Original Player Team: " + originalPlayer.team.teamName); // Real Madrid
        System.out.println("Cloned Player Team: " + clonedPlayer.team.teamName);   // Manchester United
    }
}
