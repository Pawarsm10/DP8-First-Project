package com.patterns;

public class NumberLeftAngled {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			// for spaces
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// System.out.println();
			// for Numbers
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("======================");
		
		for (int i = n; i >=0; i--) {
			// for spaces
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// System.out.println();
			// for Numbers
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
