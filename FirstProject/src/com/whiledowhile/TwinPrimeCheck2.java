package com.whiledowhile;

import java.util.Scanner;

public class TwinPrimeCheck2 {

	static boolean checkTwin(int n) {
		
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0)
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Enter  two numbers :");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if(checkTwin(num1) && checkTwin(num2)) {
			
			if(num1-num2==2 || num2-num1==2) {
				System.out.println("Numers are twin prime");
			}
			else {
				System.out.println("Numers are not twin prime");
			}
		}
		else
			System.out.println("Numers are not twin prime");

	}

}
