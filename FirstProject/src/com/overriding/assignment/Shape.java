package com.overriding.assignment;
/*
 * 4)WAP to create class shape with method draw().
 * create class circle, square, Rectangle which extends Shape implement draw() differently in each child.
 *  
 */
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle Shape");
	}
	
}
class Square extends Shape{
	public void draw() {
		System.out.println("Square Shape");
	}
	
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle Shape");
	}
	
}

public class Shape {
	
	public void draw() {
		System.out.println("draw Shape");
	}

	public static void main(String[] args) {
		

		Shape s=new Rectangle();
		s.draw();
		Square c=new Square();
		c.draw();
	}

}
