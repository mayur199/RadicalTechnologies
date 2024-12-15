package parkinglotsystem;

import java.time.LocalDateTime;

public class Car {

	private String licensePlate;
	private String carName;
	private String color;
	private LocalDateTime inTime;
	private LocalDateTime outTime;

	public Car(String licensePlate, String carName, String color) {
		super();
		this.licensePlate = licensePlate;
		this.carName = carName;
		this.color = color;
	    this.inTime = null;
        this.outTime = null;
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

	public LocalDateTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalDateTime inTime) {
		this.inTime = inTime;
	}

	public LocalDateTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Car [licensePlate=" + licensePlate + ", carName=" + carName + ", color=" + color + ", inTime=" + inTime
				+ ", outTime=" + outTime + "]";
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
