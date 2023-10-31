package com.datatypes;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=89;
		
		System.out.println((num>70)&&(num<80));
		System.out.println((num>70)&&(num<90));

		System.out.println((num>100)||(num<80));
		System.out.println((num>70)||(num<90));
		
		System.out.println((num>80));
		System.out.println(!(num>80));
		
		System.out.println((num<100)||(num==80));

	}

}
