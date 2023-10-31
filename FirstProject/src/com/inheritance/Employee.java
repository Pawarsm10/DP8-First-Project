package com.inheritance;

public class Employee {
	
	private int eid;
	private String name;
	private double salary;
	private MyDate doj;

	Employee()
	{
		System.out.println("Employee default constructor");
	}
	Employee(int eid,String name,double salary,MyDate doj)
	{
		
		System.out.println("Employee para constructor");
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.doj=doj;
	
	}
	public double calculateSalary() 
	{
		System.out.println("Employee calculatesalary");
		return salary;
	}
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDoj() {
		return doj;
	}
	public void setDoj(MyDate doj) {
		this.doj = doj;
	}
	public String toString() {
		return "Eid: "+eid+" Name: "+name+" Salary: "+salary+" "+doj;
	}
	public static void main(String[] args) {

     Employee emp=new Employee();

	}

}
