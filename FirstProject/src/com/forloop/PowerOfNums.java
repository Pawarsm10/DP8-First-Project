package com.forloop;

import java.util.Scanner;

public class PowerOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the base and power :");
		int base=scan.nextInt();
		int power=scan.nextInt();
		int res=1;
		
		for(int i=power;i>=1;i--) {
			
			res=res*base;
		}
		System.out.println("The power is "+res);
	}

}
