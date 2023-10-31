package com.forloop;

import java.util.Scanner;

public class DisarumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");

		int num=scan.nextInt();
		int num1=num;
		int sum1=0;
		int len=0;
		
		while(num>0) {
			int dig=num%10;
			len++;
			num=num/10;
		}
		System.out.println(len);
		
		while(num1>0) {
			int dig=num1%10;
			int sum=1;
			for(int i=len;i>=1;i--) {
				sum=sum*dig;
			}
			len=len-1;
			num1=num1/10;
			sum1+=sum;
		}
		System.out.println(sum1);
		
	}

}
