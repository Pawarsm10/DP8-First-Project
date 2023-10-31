package com.inheritance;

public class SalesPerson extends WageEmp {

	double sale, comm;
	public SalesPerson() 
	{
		System.out.println("Default constructor of SalesPerson ");
	}
	
	public SalesPerson(int eid,String name,double salary,MyDate doj,int noofemp,double bonus,
			           double hrs,double rate,double sale,double comm) 
	{
		
		super(eid,name,salary,doj,noofemp,bonus,hrs,rate);
		this.sale=sale;
		this.comm=comm;
	}
	public double calculateSalary() 
	{
		System.out.println("CalculateSalary of SalesPerson");
		double s=super.calculateSalary()+sale*comm;
		
		super.setSalary(s);
		return s;
	}
	public String toString() {
		return super.toString()+" Sale: "+sale+" Commision: "+comm;
	}
	
	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public static void main(String[] args) {


		SalesPerson sp=new SalesPerson(111,"David Warner",10000,new MyDate(10,10,2023),10,2000,10,100,50,3000);
		System.out.println(sp);

	}

}
