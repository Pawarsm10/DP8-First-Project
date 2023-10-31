package com.ternary;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=20;
	/*	boolean status;
		if(age>18) {
			status= true;
		}
		else
			status=false;
	*/
		
		boolean status= (age>18)? true:false ;
		System.out.println(status);
		
		
		System.out.println((age>18)?"U can vote":"u cant vote");
		
	//	(age>18)?System.out.println("yes"):System.out.println("No");    doesnt work
	}

}
