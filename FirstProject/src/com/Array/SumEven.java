package com.Array;

public class SumEven {

	int arr[];
	
	
	SumEven(){
		arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=i;
		}
	}
	
	public void add() {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		

		SumEven s=new SumEven();
		s.add();
	}

}
