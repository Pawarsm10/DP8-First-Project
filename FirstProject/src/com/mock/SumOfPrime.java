package com.mock;

public class SumOfPrime {

	static int check(int n) {
		
		if(n==0 || n==1)
			return 0;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return 0;
			
		}
		return n;
		
	}
	
	public static void main(String[] args) {


		int ar []= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
		sum+=check(ar[i]);
		}
		System.out.println(sum);
	}

}
