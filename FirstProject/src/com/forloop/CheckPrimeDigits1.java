package com.forloop;
//Extracting digits from number and printing prime
import java.util.Scanner;

public class CheckPrimeDigits1 {

	static void CheckDigit(int n) {

		boolean st;
		do {
			int rem = n % 10;
			st=true;
			if(rem==0 || rem==1)
				st=false;
			else
			{

			for (int i = 2; i < rem; i++) {

				if(rem%i==0) {
					st=false;
					break;
				}
			}
			}
			if(st)
				System.out.println(rem);
			n = n / 10;

		} while (n > 0);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = scan.nextInt();

		CheckDigit(num);

		scan.close();
	}

}
