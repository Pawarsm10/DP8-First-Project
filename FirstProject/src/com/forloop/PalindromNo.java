package com.forloop;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no");
		int num=scan.nextInt();
		int sum=0;
		
		while(num>0) {
			
			int dig=num%10;
			sum=sum*10 +dig;
			num=num/10;
		}
		System.out.println(sum);

	}

}
