package com.arrayofobjects.assignment;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 6)Write a Java program to create array of Employee objects.
Employee class has empNo , name. Array size should be 5.Make use of for loop.

 */
public class Employee3 {
	
	int empId;
	String empName;
	Employee3(){};
	Employee3(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}

	public String toString() {
		return "\nId: "+empId+" Name: "+empName;
	}
	public static void main(String[] args) {


		Employee3 [] emp= new Employee3 [5];
		
		Scanner scan=new Scanner(System.in);
		
			
		for(int i=0;i<emp.length;i++) {
			
		System.out.println("Enter the empNo of "+i);
		int id=scan.nextInt();
		System.out.println("Enter the Employee name of "+i);
		String name=scan.next();
		
		emp[i]=new Employee3(id,name);
		
		
		}
		System.out.println("=======================================");
		System.out.println("Employee Details are :");
		System.out.println(Arrays.toString(emp));
		scan.close();
	}

}
