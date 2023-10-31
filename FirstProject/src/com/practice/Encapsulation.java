package com.practice;

class Student{
	
	private int a;
	private String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
public class Encapsulation {

	public static void main(String[] args) {


		Student std= new Student();
        std.setA(10);		
		std.setS("Suraj");
		
		System.out.println(std.getA());
		System.out.println(std.getS());

	}

}
