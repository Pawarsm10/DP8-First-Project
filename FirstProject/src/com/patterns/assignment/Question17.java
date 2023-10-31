package com.patterns.assignment;

public class Question17 {

	public static void main(String[] args) {


		char n='F';
		for(int i='A';i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print((char)j);
			}
			System.out.println();
		}

	}

}
