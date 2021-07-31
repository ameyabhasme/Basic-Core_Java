package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class PowerofTwo {

	static final Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a number of the power: ");

		int power = S.nextInt();
		int num = 2;
		System.out.println(num);
		for (int i = 1; i <= power - 1; i++) {
			num = (num * 2);
			System.out.println(num);
		}
	}
}
