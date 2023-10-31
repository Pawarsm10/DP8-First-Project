package com.inheritance.assignment;

class Fruit2{
	public void Taste() {
		System.out.println("Delecious");
	}
}

class Apple2 extends Fruit2{
	public void color() {
		System.out.println("Red");
	}
}
class Lemon2 extends Fruit2{
	public void Taste() {
		System.out.println("Round");
	}
}
public class Question3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit2 f=new Lemon2();
		Fruit2 f1=new Apple2();
		
		f.Taste();
		f1.Taste();
	}

}
