package operators;

public class BitwiseOperator {
	public static void main(String[] args) {

		int a = 2; // Binary : 0010
		int b = 3; // Binary : 0010

		int c = a & b; // Bitwise AND 0010
						// 0011
						// 0010

		int d = a | b; // Bitwise OR 0010
						// 0011
						// 0011
		System.out.println(c); // output: 2 (0010)
		System.out.println(d); // output: 3 (0011)

		int r1 = a ^ b; // Bitwise XOR 0010
						// 0011
						// 0001

		int r2 = ~a; // Bitwise NOT

		System.out.println(r1);
		System.out.println(r2);

		int x = 5; //0000 0101
		int y = 20; // 00010100
		int z = 40; // 00101000   
		x = x << 1; // Bitwise Left Shift (Shifts bits left by 1 position) 
		y = y >> 2; // Bitwise Right Shift (Shifts bits right by 2 positions)
		z = z >>> 2; // Bitwise unsigned Right Shift(// Unsigned shift right by 2 positions)
		System.out.println(x); //10- 0000 1010
		System.out.println(y); //5- 00000101
		System.out.println(z); //10- 00001010 

	}

}
