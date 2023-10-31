package com.oops;

public class EmployeeSalaryComparison {

	int salary;
	String name;
	
	public  EmployeeSalaryComparison(String n,int s) {
		salary=s;
		name=n;
	} 
	public void compare(EmployeeSalaryComparison emp) {
		
		if(this.salary>emp.salary) {
			System.out.println("Rohit has more salary than virat : "+(this.salary-emp.salary));
			
		}
		else
			System.out.println("Virat has more salary than Rohit  : "+(emp.salary-this.salary));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeSalaryComparison emp1=new  EmployeeSalaryComparison("Rohit",50000);
		
		EmployeeSalaryComparison emp2=new  EmployeeSalaryComparison("Virat",90000);
		
		emp1.compare(emp2);
		
	}

}
