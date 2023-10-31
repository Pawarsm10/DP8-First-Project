package com.inheritance.assignment;

class Car2{
	public void Tata1() {
		System.out.println("Nexon");
	}
}
class HatchBack2 extends Car2{
	public void Toyota1() {
		System.out.println("Innova");
	}
} 
class FourWheeler2 extends Car2 {
	public void Hyundai() {
		System.out.println("Creta");
	}
}
public class Question3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FourWheeler2 f=new FourWheeler2();
		f.Tata1();
		f.Hyundai();
		
		Car2 h=new HatchBack2();
		h.Tata1();
		
		Car2 c=new FourWheeler2();
		c.Tata1();
		
	}

}
