package com.inheritance;

import java.util.Arrays;

public class Test {
	
	static void display(Employee obj) {
		System.out.println(obj);
	}

	public static void calculateSal(Employee e[]) {
		
		for(int i=0;i<e.length;i++) {
			if(e[i] instanceof SalesPerson) {
				System.err.println("SalesPerson");
				e[i].calculateSalary();
				}
			else if(e[i] instanceof WageEmp) {
				System.err.println("Wage Employee");
				e[i].calculateSalary();
				}
			else if(e[i] instanceof Manager) {
				System.err.println("Manager");
				e[i].calculateSalary();
				}
			else if(e[i] instanceof Employee) {
				System.err.println("Employee");
				e[i].calculateSalary();
				}
			System.out.println(e[i].calculateSalary());
			System.out.println("..................................");
		}
	}
	public static void main(String[] args) {


		Employee m=new Manager(202,"Wridhhiman Saha",40000,new MyDate(10,10,2022),7,4000);

		System.out.println("-----------------------------------------------------------------");
		System.out.println(m.getName()+" will receive  salary= "+m.calculateSalary());
		System.out.println("-----------------------------------------------------------------");
		
		((Manager) m).setBonus(2000);  //downcasting bcoz Employee doest not have bonus
		
		display(m);
		System.out.println("-----------------------------------------------------------------");
		
		Employee[] obj=new Employee[4];
		obj[0]=new Employee(101,"aaa",25000,new MyDate(10,11,2020));
		obj[1]=new Manager(102, "bbb", 40000, new MyDate(11,10,2021), 3, 5000);
		obj[2]=new WageEmp(103, "ccc", 30000, new MyDate(12,10,202), 20, 4000, 10, 500);
		obj[3]=new SalesPerson(104,"ddd",50000,new MyDate(13,10,2023),15,3000,5,500,25,200);
		
		calculateSal(obj);
		System.out.println("=================================================================");
		System.out.println(Arrays.toString(obj));
		
		
		
	}

}
