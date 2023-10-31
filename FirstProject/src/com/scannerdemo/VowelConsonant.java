package com.scannerdemo;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		int ch = scan.next().charAt(0);

		System.out.println(ch);
		if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105 || ch == 111
				|| ch == 117) {
			System.out.println("Given character is Owel");
		} else {
			System.out.println("Given character is Consonant");
			
		}
	}

}
