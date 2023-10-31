package com.practice;

public class Test1 {
	public void m1(int a,float b) {
		System.out.println(a+" "+b);
	}
	public void m1(float a,int b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Test1 t=new Test1();
		//t.m1(20,20);                  Ambiguity

		
		
	}

}
