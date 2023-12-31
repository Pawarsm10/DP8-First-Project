package com.patterns;

public class StarLeftAngled {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			// for spaces
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// for Numbers
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========================");

		
		for (int i = n; i >= 0; i--) {
			// for spaces
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// for Numbers
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
