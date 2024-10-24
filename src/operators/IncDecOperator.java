package operators;

public class IncDecOperator {
	public static void main(String[] args) {
		int a = 5;
//		++a;
//		System.out.println(a); // 6
//		a--;
//		System.out.println(a);// 5
//
//		--a;
//		System.out.println(a);// 4
//		++a;
//		System.out.println(a);// 5

		System.out.println(a++);// prints 5 then a becomes 6  
		System.out.println(a--);// prints 6 then a becomes 5
		System.out.println(--a);// here a becomes 4 and prints 4
		System.out.println(++a);// a becomes 5 and prints 5

//		int x = 10;
//
//		System.out.println("Pre-increment: " + (++x)); // x becomes 11, prints 11
//		System.out.println("Post-decrement: " + (x--)); // prints 11, then x becomes 10
//		System.out.println("Now x: " + x); // x is now 10
	}
}
