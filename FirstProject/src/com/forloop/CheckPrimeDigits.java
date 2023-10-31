package com.forloop;
//Extracting digits from number and printing prime of them
import java.util.Scanner;

public class CheckPrimeDigits {

	static void CheckDigit(int n) {

		do {
			int dig = n % 10;
			
			if(dig==2)
				System.out.println(dig);

			for (int i = 2; i < dig; i++) {

				if (dig % i == 0) {
					
					break;
				} 
				else {
					System.out.println(dig);
					break;
				}
			}
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
