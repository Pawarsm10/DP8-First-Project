package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	
	int id;
	String name;
	int arr[]=new int[5];
	
/*	Student(){
	
		
	}
*/	Student (int i,String s,int a[]) {
		id=i;
		name=s;
		arr=a;
	}
	
	public String toString() {
		return "ID :"+id+" NAME : "+name+" Marks "+Arrays.toString(arr);
	}
	
	public int calculate() {
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		int per=sum/arr.length;
		return per;
	}

	public static void main(String[] args) {


		//Student std= new Student();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks of 5 subs :");
		int arr1[]=new int [5];
		for(int i=0;i<arr1.length;i++) 
		{
			arr1[i]=scan.nextInt();
		}
		Student std1=new Student(7003,"David Warner",arr1);
		
		System.out.println(std1);
		System.out.println("Percentage is = "+std1.calculate());
	
	}

}
