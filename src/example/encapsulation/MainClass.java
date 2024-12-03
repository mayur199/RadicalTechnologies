package example.encapsulation;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Tom");

		System.out.println("Person's Name: " + person.getName());
	}
}
