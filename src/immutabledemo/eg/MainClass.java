package immutabledemo.eg;

public class MainClass {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", 30);

        System.out.println("Name: " + person.getName()); // Output: John
        System.out.println("Age: " + person.getAge());   // Output: 30

        // Trying to modify (not possible as no setters exist)
        // person.name = "Jane"; // Compilation error
    }
}
