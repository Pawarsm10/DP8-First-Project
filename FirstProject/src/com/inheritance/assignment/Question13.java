package com.inheritance.assignment;
class Car{
	public void Tata() {
		System.out.println("Nexon");
	}
}
class HatchBack extends Car{
	public void Toyota() {
		System.out.println("Innova");
	}
}
public class Question13 {

	public static void main(String[] args) {
		

		Car c=new HatchBack();
		c.Tata();
		((HatchBack)c).Toyota();
	}

}
