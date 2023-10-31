package com.abstraction.assignment;


abstract class Parent3{
	
	Parent3(String s){
		System.out.println("Parent constructor: "+s);
	}
}

class Child3 extends Parent3{
	
	Child3(String s1){
		super(s1);
		System.out.println("Child constructor");
	}
}
public class Parent2 {

	public static void main(String[] args) {


		Child3 c=new Child3("Suraj");
		System.out.println("--------------------------");
		Parent3 p=new Child3("Sonam");

	}

}
