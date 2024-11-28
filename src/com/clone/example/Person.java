package com.clone.example;

class Person implements Cloneable {
	String name;
	Address address;

	// Method for shallow copy
	protected Person shallowCopy() throws CloneNotSupportedException {
		return (Person) super.clone(); // Only copies reference of address
	}

	// Method for deep copy
	protected Person deepCopy() throws CloneNotSupportedException {
		Person deepCopyPerson = (Person) super.clone(); // Shallow copy of Person
		deepCopyPerson.address = new Address(); 
		deepCopyPerson.address.city = this.address.city; // Copy the value of city
		return deepCopyPerson;
	}
}
