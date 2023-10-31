package com.patterns;

public class AlfabatePattern1 {

	public static void main(String[] args) {



		char alpha='G';
		int n=7;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print((char)(alpha+(j-1)));
			}
			System.out.println();
		}
		

	}

}
