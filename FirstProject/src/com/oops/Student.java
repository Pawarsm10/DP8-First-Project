package com.oops;

public class Student {

	int m1,m2,m3,m4,m5;
	void setMarks(int m11,int m12,int m13,int m14,int  m15) {
		
		m1=m11;
		m2=m12;
		m3=m13;
		m4=m14;
		m5=m15;
	}
	
	void percentage() {
		
		int per=(m1+m2+m3+m4+m5)*100/500;
		System.out.println("Percentage is :"+per);
		
	    if(per>80)
	    System.out.println("Grade is A");
	    else if(per>60)
	    	System.out.println("Grade is B");
	    else if(per>40)
	    	System.out.println("Grade is C");
	    else
	    	System.out.println("Grade is D");
	}
	
	public static void main(String[] args) {


		Student std= new Student();
		std.setMarks(80,75,90,95,85);
		std.percentage();

	}

}
