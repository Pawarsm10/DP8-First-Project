package com.patterns.assignment;

public class Question21 {

	public static void main(String[] args) {


		int n=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j)
				System.out.print(i);
				else
				System.out.print("0");
			}
			System.out.println();
		}

	}

}
