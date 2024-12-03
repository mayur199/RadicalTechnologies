package example;

interface Animal {
	void sound(); // Abstract method

	default void sleep() { 
		System.out.println("Animal is sleeping.");
	}
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound(); // Output: Dog barks
		dog.sleep(); // Output: Animal is sleeping.
	}
}
