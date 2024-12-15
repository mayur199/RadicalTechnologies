package parkinglotsystem;

import java.time.LocalDateTime;

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
	//	parkingLot.parkCar(car1);
	//	parkingLot.parkCar(car2);
	//	parkingLot.parkCar(car3);
	//	parkingLot.parkCar(car4); // Duplicate license plate same as car1

        car1.setInTime(LocalDateTime.now().minusHours(2)); // Set in-time as 2 hours ago
        parkingLot.parkCar(car1);

        car2.setInTime(LocalDateTime.now()); // Current time
        parkingLot.parkCar(car2);
		
		// View all parked cars
		System.out.println("\nCurrent Cars in Parking Lot:");
		parkingLot.viewAllCars();

        // Remove a car
        parkingLot.removeCar(car1);

        // View all cars again
        System.out.println("\nAfter Removing Car:");
        parkingLot.viewAllCars();

        // Check car in and out times
        System.out.println("\nCar Details:");
        System.out.println(car1); // Includes inTime and outTime
        System.out.println(car2);
        System.out.println(car3);

		// Check if a car is parked
	//	System.out.println("\n--- Check if Cars are Parked ---");
	//	System.out.println("Is car1 parked? " + parkingLot.isCarParked(car1));
	//	System.out.println("Is car5 parked? " + parkingLot.isCarParked(car5));

		// Remove a car
//		System.out.println("\n--- Removing Cars ---");
//		parkingLot.removeCar(car2); // remove car2
//		parkingLot.removeCar(car2); // Attempt to remove a non-existent car

		// View cars after removal
//		System.out.println("\n--- Cars After Removal ---");
//		parkingLot.viewAllCars();
	}
}
