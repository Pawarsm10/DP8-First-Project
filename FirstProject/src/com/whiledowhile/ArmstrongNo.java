package com.whiledowhile;

import java.util.Scanner;

public class ArmstrongNo {

	
	static int checkArm(int n) {
		int n1=n;
		int count=0;
		do {
			count++;
			 n=n/=10;;
		}while(n!=0);
		//System.out.println(count);
		
		
		int sum1=0;
		do {
			int dig;
			int sum=1;
			dig=n1%10;
			for(int i=0; i<count ;i++) {
				sum=sum*dig;
				
			}
			sum1=sum1+sum;
			n1=n1/10;
			
		}while(n1!=0);
		System.out.println("Armstrong is :"+sum1);
		return sum1;
	}
	
	
	
	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number :");
		int num=scan.nextInt();
		System.out.println("Entered number is "+num);

		if(checkArm(num)==num) {
			System.out.println(num+" is armstrong number");
		}
		else {
			System.out.println(num+" is not an armstrong number");
		}
		scan.close();
	}

}
