package com.oops.Assignments;

public class AdditionOfTwoObjects {

	int dd;
	int mm;
	int yy;
	
	public AdditionOfTwoObjects(int d,int m, int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	
	public void add(AdditionOfTwoObjects o) {
		
		int day=this.dd+o.dd;
		int month=this.mm+o.mm;
		int year=this.yy+o.yy;
		
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String[] args) {


		AdditionOfTwoObjects obj1=new AdditionOfTwoObjects(10, 11, 2023);
		
		AdditionOfTwoObjects obj2=new AdditionOfTwoObjects(20,11,2023);
		
		obj1.add(obj2);
		obj2.add(obj1);
		

	}

}
