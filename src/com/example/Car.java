package com.example;

//Car class extending Vehicle
class Car extends Vehicle {
	public Car(String name) {
		super(name); // Call the parent class constructor
	}

	@Override
	public void start() {
		System.out.println("Car starts with a key.");
	}
}
