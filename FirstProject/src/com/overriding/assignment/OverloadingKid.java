package com.overriding.assignment;
/*
 * 1) WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

 */


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
public class OverloadingKid {

	public static void main(String[] args) {

		Kid k1=new BigKid();
		Kid k2=new TeenAger();
		
		k1.readBook();
		k2.readBook();  //This is RunTime Polymorphism. 
		
		
	}

}
