package interfaceexample;

public class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bike starts with a button.");
	}
}