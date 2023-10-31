package com.inheritance.assignment;


class Demo1{
	public void Method1() {
		System.out.println("Parent Method1");
	}
}
class  Demo2 extends Demo1{
	public void Method2() {
		System.out.println("Child Method2");
	}
}
public class Question11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d=new Demo2();
		d.Method1();
		
	}

}
