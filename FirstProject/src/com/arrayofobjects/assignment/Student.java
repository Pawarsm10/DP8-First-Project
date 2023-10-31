package com.arrayofobjects.assignment;
/*
 * 5.	Create array of students, student has (roll, name, age, marks). Print only
those students who have marks more than 60 and age is less than 15.

 */
public class Student {

	int rollNo;
	String name;
	int age;
	int marks;
	
	Student(){
		
	}
	Student(int rollNo,String name,int age,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public String toString() {
		return "RollNo: "+rollNo+" Name: "+name+" Age: "+age+" Marks: "+marks;
	}
	public static void main(String[] args) {


		Student[] std=new Student[4];
		std[0]=new Student(111,"Brate Lee",16,90);
		std[1]=new Student(222,"Brian Lara",13,55);
		std[2]=new Student(333,"Jaysurya",18,70);
		std[3]=new Student(444,"Gyale",11,59);
		
		System.out.println("Students data having marks greater than 60 are :");
		for(int i=0;i<std.length;i++) {
			
				if(std[i].marks>=60)
					System.out.println(std[i]);
			
		}
		System.out.println("====================================================");
		System.out.println("Students data having age lesser than 15 are :");
		for(int i=0;i<std.length;i++) {
			
				if(std[i].age<15)
					System.out.println(std[i]);
			}
		}

	}


