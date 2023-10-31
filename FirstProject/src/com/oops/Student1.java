package com.oops;

public class Student1 {
	
	private int dd;
	private int yy;
	private int mm;
	
	public void setDd(int d) {
		dd=d;
	}
	public void setMm(int m) {
		mm=m;
	}
	public void setYy(int y) {
		yy=y;
	}
	
	public int getDd() {
		
		return dd;
	}
public int getMm() {
		
		return mm;
	}
public int getYy() {
	
	return yy;
}

public void printDate() {
	System.out.println(dd+"/"+mm+"/"+yy);
}

	
	

	public static void main(String[] args) {


		Student1 std1=new Student1();
		std1.setDd(17);
		std1.setMm(10);
		std1.setYy(2023);
		
		std1.printDate();
		//std1.dd=10;
	

	}

}
