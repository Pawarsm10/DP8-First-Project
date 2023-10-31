package com.inheritance;

public class Manager extends Employee{
	
	private int noofemp;
	private double bonus;
	
	Manager(){
		System.out.println("Manager default constructor");
	}

	Manager(int eid,String name,double salary,MyDate doj,int noofemp,double bonus){
		
		super(eid,name,salary,doj);
		
		System.out.println("Manager para constructor");
		
		this.noofemp=noofemp;
		this.bonus=bonus;
		
	}
	public double calculateSalary() {
		
		System.out.println("Manager Calculatesalary method");
		double s= super.calculateSalary()+bonus;
		super.setSalary(s);
		return s;
	}
	
	public int getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String toString() {
		
		return super.toString()+" Number of Employee: "+noofemp+" Bonus: "+bonus;
	}
	public static void main(String[] args) {

        MyDate doj=new MyDate(10,10,2023);
        
        Manager mng=new Manager(999,"Kane Williamson",77777.77,doj,5,20000);
        System.out.println(mng);
		

	}

}
