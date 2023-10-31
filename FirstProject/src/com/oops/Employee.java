package com.oops;

public class Employee {
	 static int count=0;
	
	
	int employee_id;
	String employee_name;
	int employee_salary;
	
	public Employee(String nm,int sl){
		
		count++;
		employee_id=count;
		employee_name=nm;
	    employee_salary=sl;
		
	  //  System.out.println("Id : "+employee_id+" Name : "+employee_name+" Salary : "+employee_salary);
	}
	
	public String toString() {
		
		return "Id : "+employee_id+" Name : "+employee_name+" Salary : "+employee_salary;
	}
	
	

	public static void main(String[] args) {


		Employee emp=new Employee("SureshRaina",50000);
		Employee emp1=new Employee("YuvrajSingh",60000);
		System.out.println(emp);
		System.out.println(emp1);
		
		
	}

}
