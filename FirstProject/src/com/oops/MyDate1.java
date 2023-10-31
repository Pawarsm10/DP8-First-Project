package com.oops;

public class MyDate1 {

	int dd,mm,yy;
	
	public String toString() {
		
		return "Date : "+dd+"/"+mm+"/"+yy;
	}
	MyDate1(int d,int m,int y){
		dd=d;
		mm=m;
		yy=y;
	}
	public static void swap(MyDate1 d1,MyDate1 d2) {
		MyDate1 temp=d1;
		d1=d2;
		d2=temp;
		
	}
	public static void main(String[] args) {
		
		MyDate1 obj1=new MyDate1(18,10,2023);
		MyDate1 obj2=new MyDate1(19,10,2023);
		swap(obj1,obj2);
		
		System.out.println(obj1);  //since in java, referance is pass by value type, so only copy of referance
		System.out.println(obj2);  //is created on stack(not object), so only references got changed with local refs,
		                           //objects original(instance) referances remains as it is.
		                           //that means that local exchange does not affect instance referance(original)
		
		
		

	}

}
