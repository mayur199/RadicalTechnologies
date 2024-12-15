package parkinglotsystem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

	private Set<Car> cars = new HashSet<>();

	// Add Car
	public void parkCar(Car car) {
		if (cars.contains(car)) {
			System.out.println("Car with license plate " + car + " is already parked.");
		} else {
			car.setInTime(LocalDateTime.now()); // Set the in-time
			cars.add(car);
			System.out.println("Car parked: " + car + ", In-time: " + car.getInTime());
		}
	}

	// Remove Car
	public void removeCar(Car car) {
		if (!cars.contains(car)) {
			System.out.println("Car with license plate " + car.getLicensePlate() + " is not parked.");
		} else {
			car.setOutTime(LocalDateTime.now()); // Set the out-time
			cars.remove(car);

			// Calculate the duration and fee
			long durationInHours = calculateDurationInHours(car.getInTime(), car.getOutTime());
			int fee = calculateParkingFee(durationInHours);

			System.out.println("Car removed: " + car.getLicensePlate() + ", Out-time: " + car.getOutTime());
			System.out.println("Parking Duration: " + durationInHours + " hours, Fee: Rs " + fee);
		}
	}

	private long calculateDurationInHours(LocalDateTime inTime, LocalDateTime outTime) {
		Duration duration = Duration.between(inTime, outTime);
		return Math.max(1, duration.toHours()); // Minimum 1 hour charged
	}

	private int calculateParkingFee(long hours) {
		if (hours <= 1) {
			return 20; 
		} else if (hours <= 2) {
			return 50; 
		} else {
			return 100; 
		}
	}

	// Cars parked or not
	public boolean isCarParked(Car car) {
		return cars.contains(car);
	}

	// shows Cars in parking lot
	public void viewAllCars() {
		if (cars.isEmpty()) {
			System.out.println("No cars are parked.");
		} else {
			System.out.println("Currently Parked Cars:");
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
