package com.containment;

public class MyDate {

	private int dd,mm,yy;
	
	MyDate(){
		
		dd=17;
		mm=10;
		yy=2023;
	}
	MyDate(int dd,int mm, int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public String toString() {
		return " DD :"+dd+" MM :"+mm+" YY :"+yy;
	}
	public static void main(String[] args) {


		MyDate obj=new MyDate();
		System.out.println(obj);
		obj.setDd(18);
		obj.setMm(10);
		obj.setYy(2023);
		System.out.println(obj);
		

	}

}
