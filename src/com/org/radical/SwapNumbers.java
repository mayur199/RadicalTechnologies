package com.org.radical;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();

		System.out.println("Enter the Second number : ");
		int n2 = sc.nextInt();

		System.out.println("Before Swapping: n1 = " + n1 + ", n2 = " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After Swapping: n1 = " + n1 + ", n2 = " + n2);
		sc.close();
	}
}
