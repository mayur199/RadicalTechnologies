package com.org.radical;

import java.util.Scanner;

public class SquareNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		int Square = num * num;
		System.out.println("The Square of " + num + " is " + Square);
		sc.close();
	}
}
