package example;

public class StringMethodsExample {
	public static void main(String[] args) {
		// Original String
		String str = "Hello, Java Programming!";

		// 1. length(): Returns the length of the string
		System.out.println("Length of the string: " + str.length());

		// 2. charAt(): Returns the character at a specified index
		System.out.println("Character at index 7: " + str.charAt(7));

		// 3. substring(): Returns a part of the string
		System.out.println("Substring from index 7 to 11: " + str.substring(7, 11));

		// 4. toLowerCase(): Converts the string to lowercase
		System.out.println("Lowercase string: " + str.toLowerCase());

		// 5. toUpperCase(): Converts the string to uppercase
		System.out.println("Uppercase string: " + str.toUpperCase());

		// 6. indexOf(): Returns the index of the first occurrence of a character or
		// substring
		System.out.println("Index of 'Java': " + str.indexOf("Java"));

		// 7. replace(): Replaces occurrences of a character or substring
		System.out.println("String after replacing 'Java' with 'Python': " + str.replace("Java", "Python"));

		// 8. contains(): Checks if the string contains a specified substring
		System.out.println("Does the string contain 'Programming'? " + str.contains("Programming"));
	}
}
