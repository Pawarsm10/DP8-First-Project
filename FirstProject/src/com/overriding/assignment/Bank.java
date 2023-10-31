package com.overriding.assignment;
/*
 * 6) A bank has a principal amount and a rate of interest which is 2%. 
 * A savings account has a rate of interest 3% while a current account has 5%. 
 * Write a method that displays 
 * the rate of interest based on whether the account is default/ savings/ current.
 */
class Default{
	
	float interestRate=2f;
	public float calculate() {
return interestRate;
		}
	
}

class Savings extends Default{
	float interestRate=3f;
	public float calculate() {
		return interestRate;
	}
	
}

class Current extends Default {
	float interestRate=5f;
	public float calculate() {
		return interestRate;
	}
	
	
}


public class Bank {

	public static void main(String[] args) {


		Default [] d=new Default[3];
		
		d[0]=new Current();
		d[1]=new Savings();
		d[2]=new Default();
	
		for(int i=0;i<d.length;i++) {
			
		if(d[i] instanceof Current) {
			System.out.println("Current");
			System.out.println(d[i].calculate());
			
		}
		else if(d[i] instanceof Savings) {
			System.out.println("Savings");
			System.out.println(d[i].calculate());
		}
		else if(d[i] instanceof Default){
			System.out.println("Default");
			System.out.println(d[i].calculate());
		}
	}
	}

}
