package com.whiledowhile;

import java.util.Scanner;

public class SumOfDigits {
	//int sum=0;

	static int sumOfExtracts(int num1) {
		
		int sum=0;
		do {
			int dig=num1%10;
		     sum+=dig;
			num1/=10;
		}
		while(num1!=0);
		return sum;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		
		int sum=sumOfExtracts(num);
		System.out.println(sum);
		
	}

}
