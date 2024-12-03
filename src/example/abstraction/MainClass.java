package example.abstraction;

public class MainClass {
	public static void main(String[] args) {
	//	Animal animal = new Animal(); //error
		Animal myDog = new Dog(); // Dog object
		myDog.makeSound(); // o/p- Dog barks

		Animal myCat = new Cat(); // Cat object
		myCat.makeSound(); // o/p- Cat meows
//		Cat c = new Cat();
//		c.purr(); //o/p Cat purrs
		// myCat.purr(); //error cannot find symbol purr

	}
}