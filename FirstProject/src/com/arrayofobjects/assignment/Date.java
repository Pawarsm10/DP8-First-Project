package com.arrayofobjects.assignment;

public class Date {

	int dd,mm,yy;
	Date(){};
	
	Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public boolean compareDate(Date obj) {
		
		if(this.dd==obj.dd && this.mm==obj.mm && this.yy==obj.yy)
		{
			//System.out.println("true");
			
			return true;
			
		}
			
		else {
			//System.out.println("False");
			return false;}
		
	}
	
	public String toString() {
		return "Date : "+dd+" Month : "+mm+" Year : "+yy;
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

	public static void main(String[] args) {
	 
		Date d=new Date();
	}

}
