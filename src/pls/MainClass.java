package pls;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Car car1 = new Car("ST123", "Kia", "Red");
		Car car2 = new Car("TR88", "Sedan", "Blue");
		Car car3 = new Car("RR999", "Toyota", "Red");
		Car car4 = new Car("RR999", "Suzuki", "Yellow");
		Car car5 = new Car("ER021", "Honda", "White");

		// Create Parking Lot
		ParkingLot parkingLot = new ParkingLot();

		// Park cars
		parkingLot.parkCar(car1);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car3);
		parkingLot.parkCar(car4); // Duplicate license plate same as car3

		int totalSlots = 10;
		int availableSlots = parkingLot.getAvailableSlots(totalSlots);

		System.out.println("\nTotal Slots: " + totalSlots);
		System.out.println("Available Slots: " + availableSlots);

// --->>> Testing
//		System.out.println(car1.equals(car2)); // Should return false
//      System.out.println(car3.equals(car4)); // Should return true because licensePlate matches

//		String licensePlateToSearch = "TR888";
//		Car foundCar = parkingLot.getCarByLicensePlate(licensePlateToSearch);

		// Display parked cars before clearing
		System.out.println("\nBefore clearing the parking lot:");
		System.out.println(parkingLot);

		// Clear parking lot
		parkingLot.clearParkingLot();

		// Display the status after clearing
		System.out.println("\nAfter clearing the parking lot:");
		System.out.println(parkingLot);

//		String licensePlateToSearch = "TR88";
//		Car foundCar = parkingLot.getCarByLicensePlate(licensePlateToSearch);
//
//		if (foundCar != null) {
//			System.out.println("\nCar Found : " + foundCar);
//		} else {
//			System.out.println("\nNo car found with license plate: " + licensePlateToSearch);
//		}
//		// Get cars by color
//		List<Car> redCars = parkingLot.getCarsByColor("Red");

//		// Display the red cars
//		System.out.println("\nCars with Red color: ");
//		for (Car car : redCars) {
//			System.out.println(car);
//		}

//		// View all parked cars
//		System.out.println("\n--- All Parked Cars ---");
//		parkingLot.viewAllCars();
//
//		// Check if a car is parked
//		System.out.println("\n--- Check if Cars are Parked ---");
//		System.out.println("Is car1 parked? " + parkingLot.isCarParked(car1));
//		System.out.println("Is car5 parked? " + parkingLot.isCarParked(car5));
//
//		// Remove a car
//		System.out.println("\n--- Removing Cars ---");
//		parkingLot.removeCar(car2); // Valid removal
//		parkingLot.removeCar(car2); // Attempt to remove a non-existent car
//
//		// View cars after removal
//		System.out.println("\n--- Cars After Removal ---");
//		parkingLot.viewAllCars();
	}
}
