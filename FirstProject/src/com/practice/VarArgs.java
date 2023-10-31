package com.practice;


class Master{
	int sum=0;
	public void add(int ...a) {
		
		for(int e:a) {

         sum+=e;
		}
		System.out.println(sum);
	}
}
public class VarArgs {

	public static void main(String[] args) {


		Master std= new Master();
		std.add(10,20,30);
		std.add(40,50,60);

	}

}
