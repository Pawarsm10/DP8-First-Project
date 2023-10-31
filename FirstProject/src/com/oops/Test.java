package com.oops;

public class Test {

	public void method1(double a,double b) {
		System.out.println("This is double");
	}
	public void method1(float c,float d) {
		System.out.println("This is float");
	}
	public static void main(String[] args) {


		Test t=new Test();
		t.method1(10l, 20l);
		

	}

}
