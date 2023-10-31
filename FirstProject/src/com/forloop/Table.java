package com.forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no");
		int num=scan.nextInt();
		
		for(int i=1;i<=10;i++) {
		
			System.out.print(num*i+" ");
			
		}
	}

}
