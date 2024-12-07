package parkinglotsystem;

public class MainClass {

	public static void main(String[] args) {

		Car car1 = new Car("ST123", "KiA", "Red");
		Car car2 = new Car("TR88", "Sedan", "Blue");
		Car car3 = new Car("RR999", "Toyota", "Red");
		Car car4 = new Car("ST123", "suzuki", "yellow");
		Car car5 = new Car("ER021", "Honda", "White");

		// Create Parking Lot
		ParkingLot parkingLot = new ParkingLot();

		// Park cars
		parkingLot.parkCar(car1);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car3);
		parkingLot.parkCar(car4); // Duplicate license plate same as car1

		// View all parked cars
		System.out.println("\n--- All Parked Cars ---");
		parkingLot.viewAllCars();

		// Check if a car is parked
		System.out.println("\n--- Check if Cars are Parked ---");
		System.out.println("Is car1 parked? " + parkingLot.isCarParked(car1));
		System.out.println("Is car5 parked? " + parkingLot.isCarParked(car5));

		// Remove a car
		System.out.println("\n--- Removing Cars ---");
		parkingLot.removeCar(car2); // remove car2
		parkingLot.removeCar(car2); // Attempt to remove a non-existent car

		// View cars after removal
		System.out.println("\n--- Cars After Removal ---");
		parkingLot.viewAllCars();
	}
}
