package com.oops;

public class Arithmatic {

	
	public void multiply(int a,int b) {
		System.out.println(a+"  "+b);
	}
	public void multiply(float c,int d) {
		System.out.println(c+" "+d);
	}
	public void multiply(double d) {
		System.out.println(d);
	}
	public void multiply(int e,float f,String s) {
		System.out.println(e+" "+f+" "+s);
	}

	public static void main(String[] args) {


		Arithmatic ar=new Arithmatic();
		ar.multiply(10, 20);
		ar.multiply(30.50f, 40);
		ar.multiply(40.75);
		ar.multiply(50, 60.99f, "DavidWarner");
		
	}

}
