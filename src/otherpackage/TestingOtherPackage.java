package otherpackage;

import subexample.iccranking;

public class TestingOtherPackage extends iccranking {
	public static void main(String[] args) {

		// Protected method is accessible via inheritance in a subclass
		TestingOtherPackage test = new TestingOtherPackage();
		System.out.println("Accessing protected method from subclass:\n" + test.top3testbatsmen());

		// Default method is NOT accessible in another package
		// System.out.println(test.top3ODIbatsmen()); // Uncommenting this line will cause a compilation error

		System.out.println("Default methods are NOT accessible in other packages.");
	}
}