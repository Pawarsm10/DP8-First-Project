package com.containment;

public class Account {

	int accNo;
	String name;
	double balace;
	static double intRate;
	static
	{
		intRate=5.8;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double balace) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balace = balace;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalace() {
		return balace;
	}
	public void setBalace(double balace) {
		this.balace = balace;
	}
	public static double getIntRate() {
		return intRate;
	}
	public static void setIntRate(double intRate) {
		Account.intRate = intRate;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balace=" + balace + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();
		System.out.println(obj);
		Account obj1=new Account(101, "Pankaj",45000);
		System.out.println(obj1);
		
		// creating obj of userdefined class
		

	}

}
