package com.arrayofobjects.assignment;

import java.util.Arrays;
/*7)Employee class is as follows .

Employee {
int empno ;
String name ;

Department dept ;}
Where dept is object of department class. Department class
as deptId and deptname.
Write a program to create array of 3 employees. Each
employee will have different department. 

 * 
 */
public class Employee4 {

	int empNo;
	String empName;
	Dept dept;
	
	Employee4(){};
	Employee4(int empNo,String empName,Dept dept){
		this.empNo=empNo;
		this.empName=empName;
		this.dept=dept;
	}
	public String toString() {
		return "\nEmpNo: "+empNo+" EmpName: "+empName+" Department: "+dept;
	}
	public static void main(String[] args) {


		Employee4 []emp=new Employee4[3];
		Dept dept1=new Dept(7003,"Mechanical");
		emp[0]=new Employee4(1001,"Kuldeep Yadav",dept1);
		
		Dept dept2=new Dept(4003,"Civil");
		emp[1]=new Employee4(2002,"Axar Patel",dept2);
		
		Dept dept3=new Dept(9003,"Electrical");
		emp[2]=new Employee4(3003,"R Ashwin",dept3);
		

		System.out.println(Arrays.toString(emp));
	}

}
