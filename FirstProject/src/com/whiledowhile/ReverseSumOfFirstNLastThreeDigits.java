package com.whiledowhile;

import java.util.Scanner;

public class ReverseSumOfFirstNLastThreeDigits {

	static int calSumOfThree(int n) {
		
		int sum=0;
		for(int i=1;i<=3;i++) {
			
			int dig=n%10;
			sum+=dig;
			n/=10;
		}
		return sum;
		
	}
	static int reverseNum(int n1) {
		
		int rev=1;
		while(n1>0) {
			
			int dig=n1%10;
			rev=rev*10 +dig;
			n1/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter at least 3 digit number");
		int num=scan.nextInt();
        
		int sumOfLast3=calSumOfThree(num);
		System.out.println("Sum of last 3 :"+sumOfLast3);
		
		int revNum=reverseNum(num);
	//	System.out.println(revNum);
		
		int sumOfFirst3=calSumOfThree(revNum);
		System.out.println("Sum of last 3 :"+sumOfFirst3);
		
		if(sumOfFirst3==sumOfLast3) {
			System.out.println("Sum is same");
		}
		else
			System.out.println("Sum is not same");
		
		
	}

}
