package com.scannerdemo;

import java.util.Scanner;

public class PercentageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=scan.next();
		
		System.out.println("Enter your sub1 Marks");
		float sub1=scan.nextFloat();
		
		System.out.println("Enter your sub2 Marks");
		float sub2=scan.nextFloat();
		
		System.out.println("Enter your sub3 Marks");
		float sub3=scan.nextFloat();
		
		System.out.println("Enter your sub4 Marks");
		float sub4=scan.nextFloat();
		
		System.out.println("Enter your sub5 Marks");
		float sub5=scan.nextFloat();
		
		float per=(sub1+sub2+sub3+sub4+sub5)*100/500 ;
		System.out.println(name+" Your percentage is :"+per);
		if(per<40) 
			System.out.println("Sorry you are failed!");
		else 
			System.out.println("Congratulation you have Passed");
		scan.close();
	}

}
