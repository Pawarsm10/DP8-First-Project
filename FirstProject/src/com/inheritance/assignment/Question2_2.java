package com.inheritance.assignment;

class Fruit1{
	public void Taste() {
		System.out.println("Delecious");
	}
}

class Apple1 extends Fruit1{
	public void color() {
		System.out.println("Red");
	}
}
class Lemon1 extends Apple1{
	public void shape() {
		System.out.println("Round");
	}
}
public class Question2_2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lemon1 a=new Lemon1();
		a.shape();
		a.color();
		a.Taste();
	}

}
