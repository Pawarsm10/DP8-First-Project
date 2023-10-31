package com.containment;

public class Bank {

	private String bankName="Bank of India";
	private String add;
	private int ifsc;
	private Account acc;
	
	public Bank() {
		bankName="Bank Of India";
		add="FC Road";
		ifsc=5555;
		acc=new Account();
	}
	
	public Bank(String bankName,String add,int ifsc,Account acc) {
		this.bankName=bankName;
		this.add=add;
		this.ifsc=ifsc;
		this.acc=acc;
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public String toString() {
		return "Welcome to - "+bankName+" Branch -"+add+" IFSC -"+ifsc+" "+acc;
	}
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		System.out.println(bank);
		
		Account acc1=new Account(7002,"Shane Watson",9000);
		Bank bank1=new Bank("IDBI bank","Rajarampuri",7777,acc1);
		System.out.println(bank1);
		
		

	}

}
