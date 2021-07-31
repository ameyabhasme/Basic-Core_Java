package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class FlipCoin {
	static final Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Flip coin times: ");

		int num = S.nextInt();
		int count = 0;
		double headCount = 0;
		double tailCount = 0;
		double headPer;
		double tailPer;
		while (num != count) {

			if (Math.random() < 0.5) {
				System.out.println("Tails");
				tailCount++;
			} else {
				System.out.println("Heads");
				headCount++;
			}
			count++;
		}
		tailPer = (tailCount / num) * 100;
		headPer = (headCount / num) * 100;
		System.out.println("Tails: " + tailCount);
		System.out.println("Heads: " + headCount);
		System.out.format("Tails percentage: %.2f", tailPer);
		System.out.format("\nHeads percentage: %.2f", headPer);
	}
}
