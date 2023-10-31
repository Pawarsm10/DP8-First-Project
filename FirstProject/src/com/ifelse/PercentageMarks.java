package com.ifelse;

public class PercentageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sub1 = 94;
		float sub2 = 90.4f;
		float sub3 = 88.2f;
		float sub4 = 91.5f;
		float sub5 = 75.9f;

		float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) * 100 / 500;
		System.out.println("Your marks are :" + percentage);
		if (percentage >= 40) {
			System.out.println("Congrats you are Passed!");
		} else {
			System.out.println("Sorry You are failed!");
		}
	}

}
