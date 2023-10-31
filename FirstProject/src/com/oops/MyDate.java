package com.oops;
//Object Returning
public class MyDate {

	private int dd,mm,yy;
	
	public void setData(int d,int m, int y) {
		
		dd=d;
		mm=m;
		yy=y;
	}
	public void printDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public MyDate getObject() {           //Object returning.
		
		this.dd=20;
		this.mm=10;
		this.yy=2023;
		
		return this;                     //returning current object with changed data
	}
	public static void main(String[] args) {


		MyDate obj= new MyDate();
		obj.setData(10, 9, 2023);
		obj.printDate();
		
		MyDate o=obj.getObject();        //Object returning.
		o.printDate();
	}

}
