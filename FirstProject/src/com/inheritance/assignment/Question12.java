package com.inheritance.assignment;

class Fruit{
	public void Taste() {
		System.out.println("Delecious");
	}
}
class Lemon extends Fruit{
	public void Color() {
		System.out.println("Red");
	}
}
public class Question12 {

	public static void main(String[] args) {
		

		Fruit f=new Lemon();
		f.Taste();
	}

}
