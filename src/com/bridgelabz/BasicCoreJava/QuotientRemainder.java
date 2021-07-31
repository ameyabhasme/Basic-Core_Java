package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class QuotientRemainder {
	static final Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Dividend and Divisor: ");
		int dividend = S.nextInt();
		int divisor = S.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
