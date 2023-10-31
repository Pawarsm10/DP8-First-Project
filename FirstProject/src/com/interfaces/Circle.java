package com.interfaces;

public class Circle implements Printable{

	   public void show() {
		   System.out.println("This is show from Circle");
	   }
	   
	   public static void main(String []args) {
		   Printable p=new Circle();
		   p.show();
	   }
	}
