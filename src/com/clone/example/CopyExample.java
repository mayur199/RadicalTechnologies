package com.clone.example;

public class CopyExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Original person object
		Person originalPerson = new Person();
		originalPerson.name = "Alice";
		originalPerson.address = new Address();
		originalPerson.address.city = "New York";

		// Shallow copy of person
		Person shallowCopyPerson = originalPerson.shallowCopy();

		// Deep copy of person
		Person deepCopyPerson = originalPerson.deepCopy();

		// Modify the address in shallow copy
		shallowCopyPerson.address.city = "Los Angeles";

		// Modify the address in deep copy
		deepCopyPerson.address.city = "Chicago";

		// Output results to show difference between shallow and deep copies
		System.out.println("Original Person City: " + originalPerson.address.city); // Los Angeles
		System.out.println("Shallow Copy Person City: " + shallowCopyPerson.address.city); // Los Angeles
		System.out.println("Deep Copy Person City: " + deepCopyPerson.address.city); // Chicago
	}
}
