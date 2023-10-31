package com.Array;

import java.util.Arrays;

public class EnhanceForLoopDemo{

	int arr[];

	EnhanceForLoopDemo() {

		arr = new int[5];
		for (int i=0;i<arr.length;i++) {
		arr[i] = i;
		}
	}

	EnhanceForLoopDemo(int obj[]) {
		arr = obj;
	}
	
	public int addArrayElements() {
		int sum=0;
		for(int j:arr) {
			sum+=j;
			
		}
		return sum;
		
		
	}
	public int [] reverseArray() {
		
	/*	int [] rev=new int [arr.length];    //reversing by new array creation
		for(int i=0;i<arr.length;i++) {
			
			rev[i]=arr[arr.length-1-i];
		}
		return rev;
	*/
		for(int i=0;i<arr.length/2;i++) {
			
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return arr;
	
	}

	

	public static void main(String[] args) {

		EnhanceForLoopDemo e = new EnhanceForLoopDemo();

		int objArr[] = { 5, 6, 7, 9 };	
		EnhanceForLoopDemo e1 = new EnhanceForLoopDemo(objArr);
		
		System.out.println(e1.addArrayElements());
		int res[]=e.reverseArray();
		System.out.println(Arrays.toString(res));
		

	}

}
