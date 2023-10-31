package com.inheritance.assignment;

class Demo44{
	public void Method1() {
		System.out.println("Parent Method1");
	}
}
class  Demo43 extends Demo44{
	public void Method2() {
		System.out.println("Child Method2");
	}
}
class  Demo45 extends Demo44{
	public void Method3() {
		System.out.println("Child Method3");
	}
	public void Method2() {
		System.out.println("Overriden Method2");
	}
}
public class Question3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo44 d=new Demo45();
		Demo44 d1=new Demo43();
		
		d.Method1();
		d1.Method1();
	}

}
