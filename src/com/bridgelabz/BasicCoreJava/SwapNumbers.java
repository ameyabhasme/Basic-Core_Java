package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class SwapNumbers {

	static final Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter 2 numbers: ");
		int num1 = S.nextInt();
		int num2 = S.nextInt();

		int temp;
		System.out.println("\nBefore swapping numbers: " + num1 + "  " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: " + num1 + "   " + num2);

	}
}
