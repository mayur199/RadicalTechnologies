package com.example;

//Abstract class with public specifier
public abstract class Vehicle {
	private String name; // Private variable (access limited to this class)

	// Public constructor
	public Vehicle(String name) {
		this.name = name;
	}

	// Abstract method (modifier)
	public abstract void start();

	// Concrete method
	public void showName() {
		System.out.println("Vehicle name: " + name);
	}
}