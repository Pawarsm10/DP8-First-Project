package com.inheritance.assignment;

class Demo22{
	public void Method1() {
		System.out.println("Parent Method1");
	}
}
class  Demo23 extends Demo22{
	public void Method2() {
		System.out.println("Child Method2");
	}
}
class  Demo24 extends Demo23{
	public void Method3() {
		System.out.println("Child Method3");
	}
	public void Method2() {
		System.out.println("Overriden Method2");
	}
}
public class Question2_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo22 d=new Demo24();
		d.Method1();
		
		
		
		Demo23 d1=new Demo24();
		d1.Method2();
	}

}