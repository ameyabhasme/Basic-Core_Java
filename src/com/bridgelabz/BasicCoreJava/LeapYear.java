package com.bridgelabz.BasicCoreJava;

import java.util.Scanner;

public class LeapYear {

	static final Scanner S = new Scanner(System.in);

	public void checkYear(int year) {

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It is a Leap Year.");
		} else {
			System.out.println("It's not a Leap Year.");
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter year(4 digit):: ");

		int year = S.nextInt();
		LeapYear leap = new LeapYear();
		leap.checkYear(year);
	}
}
