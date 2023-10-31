package com.object;

class Employee{
	
	int eid;
	String ename;
	int esal;
	
	Employee(){
		
	}
	Employee(int eid,String ename,int esal){
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
}
	@Override
	public boolean equals(Object obj) {
		
		Employee e=(Employee)obj;
		if(this.eid==e.eid && this.ename==e.ename && this.esal==e.esal) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {        
		
		final int prime=111;
		int result=1;
		result=prime*result;
		return result;
	}

}
public class overriding {

	public static void main(String[] args) {

		Employee e1=new Employee(11,"Suraj",99999);
		Employee e2=new Employee(11,"Suraj",99999);
		
		System.out.println(e1.equals(e2));
		
		//Employee e3=e1;
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		

	}

}
