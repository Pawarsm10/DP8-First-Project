package com.whiledowhile;

import java.util.Scanner;

public class PalindromCheck {
	
	static boolean palin(int n) {
		int rev=0;
		int original=n;
		do {
			int dig=n%10;
			rev=rev*10 +dig;
			n/=10;
			
		}while(n!=0);
		
		if(original==rev)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number :");
		int num=scan.nextInt();
		
		if(palin(num))
			System.out.println("Number is Palindrom");
		else
			System.out.println("number is not a Palindrom");
	}

}
