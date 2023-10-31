package com.forloop;

import java.util.Scanner;

public class PrimeNo {

	static boolean primeCheck(int n) {
		
		boolean status=true;
		if(n==0 || n==1)
			status=false;
		else {
			for(int i=2;i<n;i++) { //i<=n/2 also possible
				
				if(n%i==0)
					status=true;
				break;
			}
			
		}
		return status;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=scan.nextInt();
		
		if(primeCheck(num))
			System.out.println("Entered number is prime");
		else
			System.out.println("Entered number is not a prime");
	}

}
