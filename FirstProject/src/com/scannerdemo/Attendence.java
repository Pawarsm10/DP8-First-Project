package com.scannerdemo;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter no of classed held :");
		int total=scan.nextInt();
		System.out.println("Enter no of classed attended :");
		int attd=scan.nextInt();
		
		float per= (float) attd*100/total;
		
		if(per>=75) 
			System.out.println("Your attendence percentage is :"+per+" You are eligible to attend the exam!");
		
		else
			System.out.println("Your attendence percentage is :"+per+" You are not eligible to attend the exam!");
	}

}
