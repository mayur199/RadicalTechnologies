package example;

public class WrapperClassExample {
	public static void main(String[] args) {

		Float floatValue = 10.5f;
		System.out.println("Float Value: " + floatValue);
		System.out.println("byte value: " + floatValue.byteValue());

		Double doubleValue = 20.123;
		System.out.println("\nDouble Value: " + doubleValue);
		System.out.println("value: " + doubleValue.intValue());

		Boolean booleanValue = true;
		System.out.println("\nBoolean Value: " + booleanValue);
		System.out.println("Value -- " + Boolean.toString(false));

		Character charValue = 'A';
		System.out.println("\nCharacter Value: " + charValue);
		System.out.println("To Lowercase: " + Character.toLowerCase(charValue));
	}
}
