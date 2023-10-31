package com.practice;

abstract class Parent{
	
	abstract void sit() ;
	public void eat() {
		System.out.println("Parent eat");
	}
}

class Child extends Parent{
	
	public void sit() {
		System.out.println("Child sit");
	}
	public void eat() {
		System.out.println("Child eat");
	}
	public void bark() {
		System.out.println("Child bark");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p=new Child();
		p.eat();
		p.sit();
		
		((Child)p).bark(); //down casting for accessing specialized method using parent ref
		
		Child c=new Child();
		c.bark();
		
		
		
	}

}
