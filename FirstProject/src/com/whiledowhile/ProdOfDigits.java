package com.whiledowhile;

import java.util.Scanner;

public class ProdOfDigits {
	
	static int prodOfExtracts(int n) {
		
		int prod=1;
		do {
			int dig=n%10;
			prod*=dig;
			n/=10;
			
		}while(n!=0);
		return prod;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		int prod=prodOfExtracts(num);
		System.out.println("Product of digits of number :"+prod);
	}

}
