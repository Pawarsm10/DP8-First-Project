package com.scannerdemo;

import java.util.Scanner;

public class IfElseLadderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your percentage :");
		float per = scan.nextFloat();
		char grade;

		if (per >= 85) {
			grade = 'A';
		} else if (per >= 70) {
			grade = 'B';
		} else if (per >= 65) {
			grade = 'C';
		} else if (per >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		if (grade != 'F') {
			System.out.println("Your are passed with grade :" + grade);
		} else
			System.out.println("Sorry You are Failed!");
	}

}
