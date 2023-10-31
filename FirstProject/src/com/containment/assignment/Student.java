package com.containment.assignment;
/*1. WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method
*/
public class Student {

	int rollNo;
	String name;
	Department dept;
	
	Student(){
		
	};
	Student (int rollNo,String name,Department dept){
		this.rollNo=rollNo;
		this.name=name;
		this.dept=dept;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Roll no: "+rollNo+" Student Name: "+name+" "+dept;
	}
	
	public static void main(String[] args) {


		Student std=new Student();
		System.out.println(std);
		Department dept1=new Department();
		Student std1=new Student();
		dept1.setId(888);
		dept1.setName("Environmental");
	
		std1.setRollNo(99);
		std1.setName("Axar");
		std1.setDept(dept1);
		System.out.println(std1);
		
	///	Department dept1=new Department(111,"Entc");
	//	Student std1=new Student(303,"Dhoni", dept1);
		//System.out.println(std1);
		
		
		

	}

}
