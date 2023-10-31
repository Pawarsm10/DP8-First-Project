package com.whiledowhile;

import java.util.Scanner;

public class DisariumCheck {

	static int countDig(int n) {

		int count = 0;
		while (n > 0) {

			count++;
			n /= 10;
		}
		return count;
		// System.out.println(count);
	}

	static int calPower(int base, int index) {
		int power = 1;
		for (int i = 0; i < index; i++) {
			power = power * base;
		}
		return power;
	}

	static int isDisarium(int n) {
		int sum = 0;
		// int temp=n;
		int count = countDig(n);

		while (n > 0) {

			int digit = n % 10;
			int digPowerSum = calPower(digit, count);
			count--;

			sum += digPowerSum;
			n /= 10;
		}
		// System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int sum = isDisarium(num);

		if (sum == num) {
			System.out.println("Number is Disarium!");
		} else
			System.out.println("Not Disarium!");
	}

}
