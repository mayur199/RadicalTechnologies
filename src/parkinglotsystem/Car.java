package parkinglotsystem;

public class Car {

	private String licensePlate;
	private String carName;
	private String color;

	public Car(String licensePlate, String carName, String color) {
		super();
		this.licensePlate = licensePlate;
		this.carName = carName;
		this.color = color;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [licensePlate=" + licensePlate + ", carName=" + carName + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else {
			Car car = (Car) obj;
			return licensePlate.equalsIgnoreCase(car.licensePlate);
		}
	}

	@Override
	public int hashCode() {
		return this.licensePlate.hashCode();
	}

}
