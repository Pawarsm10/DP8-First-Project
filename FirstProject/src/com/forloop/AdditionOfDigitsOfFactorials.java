package com.forloop;

import java.util.Scanner;

public class AdditionOfDigitsOfFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		int dig;
		int sum=1;
		int sum1=0;
		while(num>0) {
			
			dig=num%10;
			for(int i=dig;i>=1;i--) {
				sum*=i;
				
			}
			num=num/10;
			sum1=sum1+sum;
		}
		System.out.println(sum);
	}

}
