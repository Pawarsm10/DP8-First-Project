package com.forloop;

public class DivisibleNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Bie");
			} 
			
			else if (i % 3 == 0) {
				System.out.println("Hello");
			} 
			
			else if (i % 5 == 0) {
				System.out.println("Welcome");
			}

			else
				System.out.println(i);
		}
	}

}
