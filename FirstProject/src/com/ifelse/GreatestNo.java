package com.ifelse;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 3 nos :");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Greatest no is :"+num1);
			}
			else {
				System.out.println("Greatest no is :"+num2);

			}
		}
		else {
			if(num2>num3) {
				System.out.println("Greatest no is :"+num2);

			}
			else {
				System.out.println("Greatest no is :"+num3);
			}
		}

		//2nd way
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("Greatest no is :"+num1);
		}
		else if(num2>num3) {
			System.out.println("Greatest no is :"+num2);
		}
		else
			System.out.println("Greatest no is :"+num3);
	}

}
