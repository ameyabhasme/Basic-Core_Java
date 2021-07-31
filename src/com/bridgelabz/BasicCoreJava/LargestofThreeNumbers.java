package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class LargestofThreeNumbers {
	static final Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter three numbers:: ");
		int num1 = S.nextInt();
		int num2 = S.nextInt();
		int num3 = S.nextInt();
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is the largest.");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is the largest.");
		} else {
			System.out.println(num3 + " is the largest.");
		}
	}
}
