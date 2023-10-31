package com.oops.Assignments;

public class Student {
	
	 int id;
	private String name;
	
	public int getId() {
		return id=15;
	}
	public void display() {
		id=10;
		name="Rahul Dravid";
		System.out.println("ID : "+id+" Name : "+name);
		
		int rId=getId();
		id=rId;
		System.out.println("After returning from getId :"+id);
		
	}
	public void setCustomData(int customId,String customName) {
		id=customId;
		name=customName;
		System.out.println("ID : "+id+" Name : "+name);
	}
	
	public void test(Student std1) {
		
		id=20;
		System.out.println(std1);
	}

	public static void main(String[] args) {
		

		Student std= new Student();
		std.display();
		std.setCustomData(7, "Dhoni");
		
		Student std1=new Student();
		std1.test(std);
		System.out.println(std1);
		System.out.println(std1.id);
	}

}
