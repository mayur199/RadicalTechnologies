package subexample;

public class TopBatsmenChild extends iccranking {
	public void showTopBatsmen() {
		// Accessing protected method (works in same package or via subclass in other
		// package)
		System.out.println("Top 3 Test Batsmen :\n" + top3testbatsmen());

		// Accessing default method (works only in same package)
		System.out.println("Top 3 ODI Batsmen : \n" + top3ODIbatsmen());
	}
}