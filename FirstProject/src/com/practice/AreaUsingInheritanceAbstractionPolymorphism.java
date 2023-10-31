package com.practice;

import java.util.Scanner;

abstract class Shapes{                //Inheritance and Abstraction
	float area;
	abstract public void input();         //Abstraction
	abstract public void compute();       //Abstraction
	public void disp() {
    	System.out.println("Area is : "+area);
	}
}

class Rectangle1 extends Shapes{      //Inheritance
	float length;
    float breadth;
    
    public void input() {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of Rectangle");
    length=scan.nextFloat();
    
    System.out.println("Enter the breadth of Rectangle");
    breadth=scan.nextFloat();
    
    }
    public void compute() {
    	area=length*breadth;
    }
   
}
class Square1 extends Shapes{                    //Inheritance
    	float length;
        public void input() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of Square");
        length=scan.nextFloat();
       
        }
        public void compute() {
        	area=length*length;
        }
       
    }
        
class Circle1 extends Shapes{                      //Inheritance
        	float radius;
        	final float pi=3.142f;
            public void input() {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the radius of circle");
            radius=scan.nextFloat();
           }
            public void compute() {
            	area=pi*radius*radius;
            }
           
}
class Geometry {
	void permit(Shapes sh) {       //Polymorphism
	sh.input();
	sh.compute();
	sh.disp();
	}
}

public class AreaUsingInheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(); //child objects
		Square1 s=new Square1();
		Circle1 c=new Circle1();
		
		Geometry g=new Geometry();                               //Polymorphism
		g.permit(r);     //r=Child object reference              //Polymorphism
		g.permit(s);                                      //Polymorphism
		g.permit(c);                                      //Polymorphism
		
		}

}
