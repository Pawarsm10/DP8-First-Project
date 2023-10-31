package com.arrayofobjects.assignment;

public class MyDob {

	int day;
	int month;
	int year;
	
	public String toString() {
		
		return " Day :"+day+" Month "+month+" Year "+year;
	} 
	public MyDob(int day, int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
