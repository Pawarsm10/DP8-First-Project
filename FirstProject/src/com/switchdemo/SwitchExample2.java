package com.switchdemo;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter month name: ");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();

		switch (month) {

		case "January":

		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("31");
			break;
		case "September":
		case "November":
		case "April":
		case "June":
			System.out.println("30");
			break;

		case "February":
			System.out.println("Enter year");
			int year=scan.nextInt();
			if((year%4 ==0 && year%100 !=0) || year%400==0) {
				System.out.println("29");
			}
			else
			System.out.println("28");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
