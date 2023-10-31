package com.whiledowhile;

import java.util.Scanner;

public class dowhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int sum=0;
		int num=0;
		
		while(num!=0) {
			System.out.println("Enter any num :");
			num=scan.nextInt();
			sum+=sum+num;
		}
		System.out.println(sum);
	}

}
