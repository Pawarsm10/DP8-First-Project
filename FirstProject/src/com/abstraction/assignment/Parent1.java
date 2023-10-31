package com.abstraction.assignment;

abstract class Parent{
	
	abstract void cook();
	
	void wash() {
		System.out.println("Parent Wash");
	}
}

class Child extends Parent{
	
	void cook() {
		System.out.println("Child cook");
	}
}
public class Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child=new Child();
		child.cook();
		child.wash();
	}

}
