package com.methodcall;

class Methodcall2{
	
	static void staticMethod() {
		System.out.println("This is static method from other class");
	}
	
}
public class Methodcall1 {

static void addNumber(int n1, int n2) {
		
		int sum=n1+n2;
		
		System.out.println("Addition ="+sum);
	}

static void subNumber(int n3,int n4) {
	
	int diff=n3-n4;
	
	System.out.println("Subtraction ="+diff);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=200;
		int num2=100;
		 addNumber(num1,num2);
		 addNumber(300,400);
		 subNumber(num1,num2);
		 subNumber(450,300);
		 
		 Methodcall2.staticMethod();  //Checking how to call static method from other class
	}

}
