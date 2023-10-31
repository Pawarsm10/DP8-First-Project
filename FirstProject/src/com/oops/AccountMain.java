package com.oops;

class Account{
	
	static float interestRate;
	static {
		System.out.println("other class Static block");
		interestRate=8.50f;
	}
	
	static void getInterestRate() {
		System.out.println("Other class Static method : "+interestRate);

		
	}
	
}


public class AccountMain {
	
	static int accountNo;

	static{
		System.out.println("Main method Static block");
		accountNo=7003;
	}
	static void getAccountNo() {
		System.out.println("main method Static method : "+accountNo);
		
	}

	public static void main(String[] args) {

		System.out.println("Main Method");

		
		Account ac= new Account();
		Account.getInterestRate();
		

	}

}
