package com.whiledowhile;

import java.util.Scanner;

public class ReverseNumber {
	
	static int findReverse(int n) {
		
		int dig=0;
		int rev=0;
		do {
			dig=n%10;
			rev=rev*10 +dig;
			n/=10;
		}while(n!=0);
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
        int num=scan.nextInt();	
        
        System.out.println("Entered number is :"+num);
        
        System.out.println("Reverse is :"+findReverse(num));
	}

}
