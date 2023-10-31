package com.overriding.assignment;

/*
 * 8)WAP to create class Person with method readScript().
 * create class Actor which extends Person implement readScript() differently in child.
 */

class Person{
	public void readScript() {
		System.out.println("Persons readScript");
	}
}

class Actor{
	public void readScript() {
		System.out.println("Actors readScript");
	}
}
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor a=new Actor();
		a.readScript();
	}

}
