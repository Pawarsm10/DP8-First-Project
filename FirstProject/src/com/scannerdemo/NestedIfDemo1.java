package com.scannerdemo;

import java.util.Scanner;

public class NestedIfDemo1 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter your marks :");
	     float marks=scan.nextFloat();
	     
	     if(marks>=65) {
	    	 
	    	 System.out.println("You are eligible in college");
	    	 if(marks>=80) 
	    		 System.out.println("You are eligible for both com and sci stream");
	         else 
	    			 System.out.println("You are eligble only for com");
	    		 
	    	 }
	     else {
	    	 System.out.println("You are not eligble for this college");
	     }
	     }

	}


