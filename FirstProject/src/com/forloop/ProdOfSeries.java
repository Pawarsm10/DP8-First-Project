package com.forloop;

public class ProdOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long prod=1l;
		
		for(int i=1;i<=20;i++) {
			
			if(i%2==0) {
				prod*=i;
			}
			
		}
		System.out.println("Product of even series = "+prod);
	}

}
