package com.inheritance.assignment;

import java.lang.reflect.Method;

class Kid{
	
	public void readBook() {
		System.out.println("This is Kid readbook");
	}

	public void readBook(int n1,int n2) {
		
	}
}

class BigKid extends Kid{
	
	public void readBook() {
		System.out.println("This is BigKid readbook");
	}
}

class TeenAger extends Kid{
    public void readBook() {
    	System.out.println("This is Teenager readBook");
    }
}
public class Overloading {

	public static void main(String[] args) {

		Kid k1=new BigKid();
		Kid k2=new TeenAger();
		
		k1.readBook();
		k2.readBook();  //This is compileTime Polymorphism. 
		
		Class class1 = k1.getClass();
		Method[] methods = class1.getMethods();
		
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		
		System.out.println(class1);
		System.out.println(k1.getClass());
		System.out.println(k1.getClass().getName());
	
	}

}
