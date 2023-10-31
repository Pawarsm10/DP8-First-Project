package com.inheritance;

public class MyDate {
	
	private int dd,mm,yy;
	MyDate(){
		System.out.println("MyDate default Constructor");
		dd=17;
		mm=10;
		yy=2023;
	}
	
	MyDate(int dd,int mm,int yy){
		System.out.println("MyDate para constructor");
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
		
		return "Date : "+dd+"/"+mm+"/"+yy; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		MyDate m=(MyDate)obj;
		
		if(this.dd==m.dd && this.mm==m.mm && this.yy==m.yy)
			return true;
		return false;
	}
	
//	public int hashCode() {            *possible to override hashCode method to get required value
//		final int prime=31;
//	    int result=1;
//	    result=prime*result+dd;
//	    
//	    return result;
//	}

	public static void main(String[] args) {


		MyDate obj=new MyDate(11,11,2023);
		MyDate obj1=new MyDate(11,11,2023);
		
		MyDate obj2=obj1;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(obj.equals(obj1));

	}

}
