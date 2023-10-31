package com.patterns.assignment;

public class Question5 {

	public static void main(String[] args) {



		int n=5;
		System.out.println("*");
		for(int i=1;i<n;i++) {
			int k=1;
			System.out.print("*");
			for(int j=1;j<i;j++) {
				System.out.print(k);
				k++;
			}
			for(int j=i;j<=(2*i-1);j++) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			int k=1;
			System.out.print("*");
			for(int j=1;j<i;j++) {
				System.out.print(k);
				k++;
			}
			for(int j=i;j<=(2*i-1);j++) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");


	}

}
