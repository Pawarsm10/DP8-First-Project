package com.whiledowhile;

import java.util.Scanner;

public class TwinPrimeCheck {

	static boolean checkTwin(int n1,int n2) {
		
		if(n1==0 || n2==0)
			return false;
		
		int p1=0;
		int p2=0;
		
		for(int i=2;i<n1;i++) {
			
			if(n1%i==0) 
				return false;
			else 
				p1=n1;
		}
		
	//	if(p1==0) 
	//		return false;
		
		
       for(int i=2;i<n2;i++) {
			
			if(n2%i==0) 
				return false;
				
			else 
				p2=n2;			
		}
       
       if(p2==0) 
			return false;
		

   if(p2-p1==2 || p1-p2==2) {
	
	return true;
}
return false;
		
	}
	
	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Enter  two numbers :");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		boolean res=checkTwin(num1,num2);
		if(res)
			System.out.println("Numbers are twin primes");
		else
			System.out.println("Numbers are not twin primes");

		scan.close();
	}

}
