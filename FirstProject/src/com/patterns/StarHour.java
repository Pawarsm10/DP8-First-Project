package com.patterns;

public class StarHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = n ; i > 0; i--) {

			for (int j = 1; j <=(n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println("=====");
		for (int i =2; i <= n; i++) {

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			for (int j =1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

	}

}
