package com.ternary;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		
		n1=35;
		n2=40;
		n3=45;
		int greatest= (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println(greatest);
	}

}
