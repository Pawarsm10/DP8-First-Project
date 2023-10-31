package com.oops.Assignments;

import java.util.Scanner;

public class Account {

	int acc_no;
	String name;
	float amount;
	
	public void insert(int ac,String nm,float am) {
		acc_no=ac;
		name=nm;
		amount=am;
	}
	public void display() {
		System.out.println("Account number is :"+acc_no+" Name :"+name+" Amount :"+amount);
		
	}
	public void deposite(float ds) {
		amount=amount+ds;
		
	}
	public void withdraw(float wd) {
		amount=amount-wd;
	}
	public void checkBalance() {
		System.out.println("Your balance is :"+amount);
	}
	
	public static void main(String[] args) {


		Account ac=new Account();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Account number :");
		int acountNo=scan.nextInt();
		System.out.println("Enter your name :");
		String name1=scan.next();
		System.out.println("Enter Initial amount :");
		float amount1=scan.nextFloat();
		
		ac.insert(acountNo, name1, amount1);
		ac.display();
		System.out.println("Enter amount to be deposited :");
		float amount2=scan.nextFloat();
		ac.deposite(amount2);
		ac.checkBalance();
		
		System.out.println("Enter amount to be Withdrawn :");
		float amount3=scan.nextFloat();
		
		if(ac.amount>1000 && amount3<500) {
		ac.withdraw(amount3);
		}
		else
			System.out.println("Insufficient balance");
		
		ac.checkBalance();
		scan.close();
		

	}

}
