package com.arrayofobjects.assignment;
/*
 * 1.	WAP to print the employees from Employee[] array who has same salary 
 * (Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
 * //Accept id from user and show all emp who get same sal has given id
 */
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	
	int eid;
	String ename;
	double esalary;
	
	Employee(){
		
	}
	Employee(int eid,String ename,double esalary){
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	public String toString() {
		return "ID : "+eid+" NAME : "+ename+" SALARY : "+esalary;
	}
	

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public static void main(String[] args) {


		Employee []emp=new Employee[4];
		
		emp[0]=new Employee(111,"Rohit",10000);
		emp[1]=new Employee(222,"Sachin",11000);
		emp[2]=new Employee(333,"Virat",10000);
		emp[3]=new Employee(444,"Yuvi",12000);
		
		System.out.println(Arrays.toString(emp));
		
	/*	for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].esalary==emp[j].esalary) {
					System.out.println(emp[i].ename+" & "+emp[j].ename+" has equal salary = "+emp[i].esalary);
				}
				
			}
		}
		*/
		Employee obj=new Employee();   //dummy obj
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=scan.nextInt();
		for(int i=0;i<emp.length;i++) {
			if(id==emp[i].getEid()) {
				System.out.println(emp[i]);
				obj=emp[i];
				break;
			}
			
		}
		
		if(obj.getEsalary()!=0) {
			for(int i=0;i<emp.length;i++) {
				if(emp[i].getEsalary()==obj.esalary) {
					System.out.println(emp[i]);
				}
			}
		}
		else {
			System.out.println("Employee doesnt exist for this id "+id);
		}

		scan.close();
	}

}
