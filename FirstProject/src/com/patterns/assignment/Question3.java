package com.patterns.assignment;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for(int i=n;i>=1;i--) {
			for(int j=1;j<(2*i-1);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
