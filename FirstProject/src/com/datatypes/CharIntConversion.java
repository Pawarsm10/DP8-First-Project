package com.datatypes;

public class CharIntConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1='A';
        System.out.println(ch1);	
        
        char m='A';
        char n='B';
        int sum2= (m+n);
        System.out.println("sum2 is :"+sum2);
        
        char sum3= (char)(m+n);
        System.out.println("sum3 is :"+sum3);
        
        int ascii=ch1;
        System.out.println(ascii);
		
        int value=48;
        char ch2=(char) value;
        System.out.println(ch2);
        
        char c1='0';
        char c2='1';
        int sum= (c1+c2);
        System.out.println("The sum od 0 n 1 is :"+sum);
        
        char sum1=(char) (c1+c2);
        System.out.println("sum1 is :"+sum1);
        
        char ch6='$';
        System.out.println(ch6);
        
        int val=95;
        System.out.println((char)val);
        
        
	}

}
