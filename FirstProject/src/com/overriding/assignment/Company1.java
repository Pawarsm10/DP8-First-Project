package com.overriding.assignment;
/*
 * 2) WAP to create class company with method address. 
 * create class eBay which extends company implement address() differently in eBay class.
 * Here the method address ()has been overridden in child class.
 */

class Company{
	public void address() {
		System.out.println("This is Company address");
	}
	
}

class Ebay extends Company{
	public void address() {
		System.out.println("This is EBay address");
	}
}

public class Company1 {

	public static void main(String[] args) {
		

	}

}
