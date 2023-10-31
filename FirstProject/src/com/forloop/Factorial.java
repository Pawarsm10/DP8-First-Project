package com.forloop;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		int res=1;
		for(int i=6;i>=1;i--) {
			
			res=res*i;
		}
		System.out.println("Factorial of 6 is "+res);
	}

}
