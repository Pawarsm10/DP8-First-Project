package com.forloop;
//Perfect number has addition of its all divisible factors equal to that number(e.g. 28)
import java.util.Scanner;

public class PerfectNos {

	static boolean CheckPerfect(int n) {

		int sum = 0;
		if (n == 1)
			return true;
		else {
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
		}
		System.out.println("Number given :"+n);
		System.out.println("Sum of factors :"+sum);
		if (sum == n)
			return true;

		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = scan.nextInt();

		if (CheckPerfect(num))
			System.out.println("Entered number is Perfect");
		else
			System.out.println("Entered number is not a Perfect one");

		scan.close();
	}

}
