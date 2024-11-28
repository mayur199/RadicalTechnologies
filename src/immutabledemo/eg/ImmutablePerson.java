package immutabledemo.eg;

//Immutable Class
final class ImmutablePerson {
	private final String name;
	private final int age;

	// Constructor
	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}
}
