package com.whiledowhile;

import java.util.Scanner;

public class CountingNoOfDigits {

	static int counting(int n) {
		int count = 0;
		do {

		//	int dig = n % 10;
			n /= 10;
			count++;
			
		} while (n != 0);
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();

		int count = counting(num);
		System.out.println("No of digits in number are :" + count);
		scan.close();
	}

}
