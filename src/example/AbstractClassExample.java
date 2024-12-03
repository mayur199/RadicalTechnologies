package example;

abstract class Animal1 {
	abstract void sound(); // Abstract method

	public void sleep() { 
		System.out.println("Animal is sleeping.");
	}
}

class Dog1 extends Animal1 {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound(); // Output: Dog barks
		dog.sleep(); // Output: Animal is sleeping.
	}
}
