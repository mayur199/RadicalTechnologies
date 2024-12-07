package parkinglotsystem;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

	private Set<Car> cars = new HashSet<>();

	// Add Car
	public void parkCar(Car car) {
		if (cars.add(car)) {
			System.out.println("Car parked successfully: " + car);
		} else {
			System.out.println("Car is already parked: " + car);
		}
	}

	// Remove Car
	public void removeCar(Car car) {
		if (cars.remove(car)) {
			System.out.println("Car removed successfully: " + car);
		} else {
			System.out.println("Car not found in the parking lot: " + car);
		}
	}

	// Cars parked or not
	public boolean isCarParked(Car car) {
		return cars.contains(car);
	}

	// shows Cars in parking lot
	public void viewAllCars() {
		if (cars.isEmpty()) {
			System.out.println("Parking lot is empty.");
		} else {
			System.out.println("Cars currently in the parking lot:");
			for (Car car : cars) {
				System.out.println(car);
			}
		}
	}

	@Override
	public String toString() {
		return "ParkingLot [cars=" + cars + "]";
	}

}
