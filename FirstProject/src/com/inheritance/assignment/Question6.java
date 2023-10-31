package com.inheritance.assignment;

interface Cake{
	default void bake(){
		System.out.println("This is Cake Bake");
	}
}
class Strawberry implements Cake{
	
}
class BlackForest implements Cake{
	
}
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
