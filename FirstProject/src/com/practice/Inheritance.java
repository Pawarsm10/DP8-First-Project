package com.practice;


interface Parent1{
	
	void eat();
	
	default void sit() {
		System.out.println("Parent sit");
	}
	default void dance() {
		System.out.println("Parent Dance");
	}
}

class Child1 implements Parent1{
	
	public void eat() {
		System.out.println("Child eat");
	}
	public void sit() {
		System.out.println("Child sit");
	}
	void bark() {
		System.out.println("Child bark");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {

		Parent1 p=new Child1();
		p.eat();
		p.sit();
		
		p.dance();
		((Child1) p).bark(); //down casting for accessing specialized method using parent ref
		
		Child1 c=new Child1();
		c.bark();
		


	}

}
