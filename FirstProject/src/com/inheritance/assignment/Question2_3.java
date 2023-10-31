package com.inheritance.assignment;

class Car1{
	public void Tata1() {
		System.out.println("Nexon");
	}
}
class HatchBack1 extends Car1{
	public void Tata1() {
		System.out.println("Innova");
	}
} 
class FourWheeler1 extends HatchBack1 {
	public void Hyundai() {
		System.out.println("Creta");
	}
}
public class Question2_3 {

	public static void main(String[] args) {
		Car1 c=new FourWheeler1();
		c.Tata1();

	}

}
