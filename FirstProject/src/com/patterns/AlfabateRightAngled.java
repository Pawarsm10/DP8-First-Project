package com.patterns;

public class AlfabateRightAngled {

	public static void main(String[] args) {

		// int n=5;
		for (int i = 'A'; i <= 'E'; i++) {

			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();

		}
		System.out.println();
		for (char i = 'A'; i <= 'E'; i++) {

			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

}
