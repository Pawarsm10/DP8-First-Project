package com.overriding.assignment;

class Derived{
	public void getDetails(String temp) {
		System.out.println("Derived class: "+temp);
	}
}
public class Test extends Derived {

//	public int getDetails(String temp) {                //CE return type incompatible in overriding
//		System.out.println("TEst class: "+temp);
//		return 0;
//	}
	
	public void getDetails(String temp) {     
		System.out.println("TEst class: "+temp);
		
  	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.getDetails("Hello");

	}

}
