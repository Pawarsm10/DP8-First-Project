package com.overriding.assignment;
/*
 * 
 * 5)WAP to create class Bike with fields color ,speed and  method bikeInfo() 
 * which is show color and speed of bike .
 * create class Pulsar which extends Bike implement bikeInfo() differently child 
 */
class Bike{
	String color="White";
	float speed=40.40f;
	
	public void bikeInfo() {
		System.out.println(color+" "+speed);
	}
	
}

class Pulsor extends Bike {
	//String color="Flame Red";
	//float speed=60.60f;
	
	/*public void bikeInfo() {
		System.out.println(color+" "+speed);
	}
	*/
}

public class Bike1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pulsor p=new Pulsor();
		p.color="Gray";
		p.speed=70.70f;
		p.bikeInfo();
	}

}
