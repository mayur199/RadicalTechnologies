package interfaceexample;

public class MainClass {
	public static void main(String[] args) {
		Vehicle myCar = new Car(); // Car object
		Vehicle myBike = new Bike(); // Bike object

		myCar.start(); // Output: Car starts with a key.
		myBike.start(); // Output: Bike starts with a button.
	}

}
