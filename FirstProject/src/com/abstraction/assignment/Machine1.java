package com.abstraction.assignment;

abstract class Machine {
	
	public abstract void crush();
	public void rotate() {
		System.out.println("Machine rotate");
	}
}

class Juicer extends Machine{
	public void crush() {
		System.out.println("Juicer Implemented crush");
	}
	public void filter() {
		System.out.println("Juicer Filter");
	}
}
abstract class Mixer{
	public void crush() {
		System.out.println("Mixeer Crush");
	}
	public void blend() {
		System.out.println("Mixer blend");
	}
}

public class Machine1 {

	public static void main(String[] args) {


		Juicer juicer=new Juicer();
		juicer.crush();
		juicer.rotate();
		juicer.filter();
		System.out.println("------------------------------------");
		
		Machine machine=new Juicer();
		machine.crush();
		machine.rotate();
	//    machine.filter();                 * specialized methods not availabe
		((Juicer)machine).filter();
		System.out.println("------------------------------------");
		
   //	Mixer mixer=new Mixer();             *can not make object of abstract class
		

	}

}
