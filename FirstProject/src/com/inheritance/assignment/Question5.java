package com.inheritance.assignment;

class IPLTeam{
	public void Play() 
	{
		System.out.println("This is IPLTeam");
	}
	}

class CSK extends IPLTeam{
	
	
}

class RCB extends IPLTeam{
	
}
public class Question5 {

	public static void main(String[] args) {


		CSK c=new CSK();
		c.Play();
		
		RCB r=new RCB();
		r.Play();

	}

}
