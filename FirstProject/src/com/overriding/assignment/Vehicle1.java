package com.overriding.assignment;
/*
 * 3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,stop(),run() 
 * all method return string type of value. 
 * Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
 */
class Vehicle{
	
	public void accelerate(long mph) {
		
		System.out.println("Vehicle accelerate");
	}
	public String stop() {
		System.out.println("Vehicle stop");
		return "Vehicle  Stop"; 
	}
	public String run() {
		System.out.println("Vehicle run");
		return "Vehicle run";
	}
}

class Car extends Vehicle{
	
	public void accelerate(long mph) {
		System.out.println("Car accelerate");
	}
}
public class Vehicle1 {

	public static void main(String[] args) {


		Car c=new Car();
		c.accelerate(80l);
		System.out.println(c.stop());
		System.out.println(c.run());
	}

}
