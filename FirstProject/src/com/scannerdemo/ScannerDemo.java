package com.scannerdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Enter your name :");
    String name = scan.next();
    
    System.out.println("enter your roll no :");
    int rollNo = scan.nextInt();
    
    System.out.println("Enter your percentage :");
    float per = scan.nextFloat();
    
    System.out.println("Enter your grade :");
    char grade = scan.next().charAt(0);
    
    System.out.println(name+" With roll no "+rollNo+" has got "+per+ "% with grade "+grade);
	}

}
