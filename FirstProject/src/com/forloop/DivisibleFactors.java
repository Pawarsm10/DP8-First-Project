package com.forloop;

import java.util.Scanner;

public class DivisibleFactors {
	
	static void CheckFactors(int n) {
		
		if(n==1)
			System.out.println(n);
		else
		{
			for(int i=2;i<=n/2;i++) { //factors never crosses n/2 value
				if(n%i==0)
				System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		
		CheckFactors(num);

	}

}
