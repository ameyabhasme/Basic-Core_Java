package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class HarmonicNumber {
	static final Scanner S = new Scanner(System.in);

	static double nthHarmonic(int num) {

		float harmonic = 1;

		for (int i = 2; i <= num; i++) {
			harmonic += (float) 1 / i;
		}
		return harmonic;
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");

		int num = S.nextInt();
		System.out.print(nthHarmonic(num));
	}
}