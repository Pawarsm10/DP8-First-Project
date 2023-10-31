package com.methodcall;

import java.util.Scanner;

public class MethodCallDemo {

	static void callByValue(int n1, int n2) {
		System.out.println("In method before");

		System.out.println(n1+" "+n2);
		
		n1=n1+5;
        n2=n2+10;		
		System.out.println("In main after");

        System.out.println(n1+" "+n2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 nos :");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("In main before");
		System.out.println(num1+" "+num2);
		callByValue(num1,num2);
		
		System.out.println("In main after");

		System.out.println(num1+" "+num2);
		
	}

}
