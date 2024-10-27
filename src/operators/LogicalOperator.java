package operators;

public class LogicalOperator {
	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 15;
		boolean x = true;

//		System.out.println((a < b) && (b < c)); // true (Logical AND)
		System.out.println((a < b) || (++b < c)); // true (Logical AND)
		System.out.println(b);
		System.out.println(b+++c++);
		System.out.println(c);
		//Short-circuit evaluation
//		System.out.println((a > b) || (b > c)); // false (Logical OR)
//		System.out.println(!x); // false (Logical NOT)
	}

}
