package example;

public class BoxingUnboxingExample {
	public static void main(String[] args) {

		int primitiveNum = 10;
		Integer boxedNum = Integer.valueOf(primitiveNum); // Explicit Boxing 
		System.out.println("Boxing Example (Explicit): " + boxedNum);

		Integer wrapperNum = Integer.valueOf(20);
		int unboxedNum = wrapperNum.intValue(); // Unboxing
		System.out.println("Unboxing Example: " + unboxedNum);

		int autoPrimitive = 30;
		Integer autoBoxedNum = autoPrimitive; // Implicit Boxing (Autoboxing)
		System.out.println("Autoboxing Example (Implicit): " + autoBoxedNum);

		Integer autoWrapperNum = 40; // Autoboxing
		int autoUnboxedNum = autoWrapperNum; // Auto-unboxing
		System.out.println("Auto-unboxing Example: " + autoUnboxedNum);
	}
}
