package pls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

	// To display the number of available slots in the parking lot.
	public int getAvailableSlots(int totalSlots) {
		return totalSlots - cars.size();

	}

	// method searches for a car in the parking lot by its license plate
	public Car getCarByLicensePlate(String licensePlate) {
		for (Car car : cars) {
			if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
				return car;
			}
		}
		return null;

	}

	// To find all cars of a specific color
	public List<Car> getCarsByColor(String color) {
		List<Car> result = new ArrayList<>();
		for (Car car : cars) {
			if (car.getColor().equalsIgnoreCase(color)) {
				result.add(car);
			}
		}
		return result;
	}

	// To empty the parking lot by removing all cars.
	public void clearParkingLot() {
		cars.clear();
		System.out.println("Parking lot has been cleared.");
	}

	// To count the total number of parked cars.
	public int getTotalParkedCars() {
		return cars.size();
	}

	// To list all cars with a specific model name.
	public List<Car> getCarsByName(String carName) {
		List<Car> result = new ArrayList<>();
		for (Car car : cars) {
			if (car.getCarName().equalsIgnoreCase(carName)) {
				result.add(car);
			}
		}
		return result;
	}

	// To update the details of an already parked car.
	public boolean updateCarDetails(String licensePlate, String newCarName, String newColor) {
		for (Car car : cars) {
			if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
				car.setCarName(newCarName);
				car.setColor(newColor);
				return true;
			}
		}
		return false; // Car not found
	}

	@Override
	public String toString() {
		return "ParkingLot [cars=" + cars + "]";
	}
}
