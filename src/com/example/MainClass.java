package com.example;

public class MainClass {
	public static void main(String[] args) {

		Vehicle car = new Car("Sedan");
		car.start(); // Output: Car starts with a key.
		car.showName(); // Output: Vehicle name: Sedan
	}
}
