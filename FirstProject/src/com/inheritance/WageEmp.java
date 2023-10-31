package com.inheritance;

public class WageEmp extends Manager {
	
	double hrs,rate;
	public WageEmp() {
		System.out.println("WageEmp default Constructor");
	}
	public WageEmp(int eid,String name,double salary,MyDate doj,int noofemp,double bonus,
			       double hrs,double rate) {
		super(eid,name,salary,doj,noofemp,bonus);
		
		this.hrs=hrs;
		this.rate=rate;
	}
	
	public double calculateSalary() {
		System.out.println("WageEmp CalculateSalary");
		double s= super.calculateSalary()+ hrs*rate;
		super.setSalary(s);
		return s;
	}
	public String toString() {
		return super.toString()+" Hrs: "+hrs+" Rate: "+rate;
	}

	public double getHrs() {
		return hrs;
	}
	public void setHrs(double hrs) {
		this.hrs = hrs;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public static void main(String[] args) {
	
		WageEmp we=new WageEmp();

	}

}
