package operators;

public class AssignmentOperator {
	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		a = b;
		System.out.println("Simple assignment:  " + a); // 5
		a += b;
		System.out.println("Add and assign: " + a); // 10
		a -= b;
		System.out.println("Subtract and assign: " + a); // 5
		a *= b;
		System.out.println("Multiply and assign: " + a); // 25
		a /= b;
		System.out.println("Divide and assign: " + a); // 5
		a %= b;
		System.out.println("Modulus and assign: " + a);// 0

	}

}
