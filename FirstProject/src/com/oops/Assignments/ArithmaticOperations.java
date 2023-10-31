package com.oops.Assignments;

public class ArithmaticOperations {

	int num1,num2,num3;
	
	ArithmaticOperations(){
		
		num1=10;
		num2=20;
		num3=30;
	}
	public void add() {
		int addition=num1+num2+num3;
		System.out.println("Addition is :"+addition);
	}
	
	public void multip() {
		int multiplication=num3*num2*num1;
		System.out.println("multiplication is :"+multiplication);
	}
	public void sub() {
		int subtraction=num3-num2;
		System.out.println("Subtraction is :"+subtraction);
	}
	public void divide() {
		float division=(float) num3/num1;
		System.out.println("Quotient is :"+division);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmaticOperations ao=new ArithmaticOperations();
		ao.add();
		ao.multip();
		ao.sub();
		ao.divide();
	}

}
