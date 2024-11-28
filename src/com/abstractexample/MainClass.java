package com.abstractexample;

public class MainClass {

	public static void main(String[] args) {
		Animal myDog = new Dog(); // Instantiate subclass
		myDog.makeSound(); // Output: Dog barks
		myDog.sleep(); // Output: This animal sleeps.
	}
}
