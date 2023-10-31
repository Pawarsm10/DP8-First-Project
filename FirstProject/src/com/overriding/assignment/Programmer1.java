package com.overriding.assignment;


class Programmer{
	
	public void workingHrs() {
		System.out.println("Programmars workingHrs");
	}
}

class Employee extends Programmer{
	
	public void workingHrs() {
		System.out.println("Employees workingHrs");
	}
}
public class Programmer1 {

	public static void main(String[] args) {


		Employee e=new Employee();
		e.workingHrs();

	}

}
