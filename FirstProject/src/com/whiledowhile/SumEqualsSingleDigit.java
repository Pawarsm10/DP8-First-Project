package com.whiledowhile;

public class SumEqualsSingleDigit {

	static int sumCheck(int n) {
		
		int sum=0;
		while(n>0||sum>9) {
			
			
			if(n==0) {
				
				n=sum;
				sum=0;
			}
			sum+=n%10;
			
			n/=10;
		}
		return sum;
		
	}
	public static void main(String[] args) {


		int num=8976;
		System.out.println("Number :"+num);
		int ans=sumCheck(num);
		System.out.println("Answer :"+ans);
		

	}

}
