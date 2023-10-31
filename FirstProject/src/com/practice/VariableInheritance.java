package com.practice;

class Demo {
	int age=26;
	public void disp() {
		int age=32;

		System.out.println(age);
	}
}
class Demo1 extends Demo{
	int age=28;
	public void disp() {
		int age=33;
		System.out.println(age);
	}
	
//	void disp() {
//		System.out.println(age);
//		System.out.println(super.age);
//	}
}
public class VariableInheritance {

	public static void main(String[] args) {
		Demo d=new Demo1();
		Demo1 d1=new Demo1();
		System.out.println(d.age);              //Runtime polymorphism can not be achived by data members
		                                        //Data members does not support Runtimr polymorphism(i e dynamic data dispatch)
		System.out.println(d1.age);
		
		
		
		d.disp();
		d1.disp();
		
		
	}

}
