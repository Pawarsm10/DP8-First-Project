package com.ifelse;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter units consumed :");
		
		int units=scan.nextInt();
		double bill=100;
		
		if(units<=50) {
			bill+=(units*2);
		}
		else if(units<=80) {
			bill+=(50*2)+(units-50)*3;
		}
		else if(units<=100) {
			bill+=(50*2)+(30*3)+(units-80)*4;
		}
		else {
			bill+=(50*2)+(30*3)+(20*4)+(units-100)*7;
		}
		
		System.out.println("The bill for "+units+" units consumed is :"+bill);
	}

}
