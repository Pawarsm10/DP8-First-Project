package com.scannerdemo;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your age :");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("Enter your weight :");
			float wt=scan.nextInt();
			
			if(wt>=50) {
				System.out.println("You can Donate blood!");
			}
			else
				System.out.println("You are under weight to Donate blood");
		}
		else {
			System.out.println("You are too young to Donate blood");
		}
	}

}
