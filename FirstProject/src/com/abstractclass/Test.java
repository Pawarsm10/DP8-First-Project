package com.abstractclass;

abstract class Shape{
	final double pie=3.142;
//final  int a;           //      *abstract class can have constructor but interface can not
//	public Shape(){               *so abstract class final variable can be initialised by sing cont or block
//	                              *but in interface can not
//		a=10;
//	}
	final  int a; 
	 {
		a=10;
	}
	double area;
	
	public abstract void area() ;
	
	public void peremeter() {
		System.out.println("This is Shape Peremeter");
	}
} 
class Circle extends Shape {
	
	double r;
	Circle(double r){
		this.r=r;
	}
	public void area() {
		 area=pie*r*r;
		 System.out.println("Area of Circle is: "+area);
	}
	public void peremeter() {
		System.out.println("This is Circle Peremeter");
	}

	
}
class Square extends Shape{
	double s;
	Square(double s){
		this.s=s;
	}
	public void area() {
		area=s*s;
		System.out.println("Area of Square is: "+area);
	}
	public void peremeter() {
		System.out.println("This is Square Peremeter");
	}

	
}

public class Test {

	public static void main(String[] args) {
		
		Shape shape=new Circle(10.10);
		Shape shape1=new Square(12.12);
		
		shape.area();
		shape.peremeter();
		
		shape1.area();
		shape1.peremeter();
		
		
		
		Circle circle=new Circle(11.11);
		Square square=new Square(13.13);
		
       // circle.area();
		
		//square.area();
		
		circle.area();
		square.area();
		

	}

}
