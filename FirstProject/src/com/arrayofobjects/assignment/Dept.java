package com.arrayofobjects.assignment;

public class Dept {

	int did;
	String dname;
	public String toString() {
		
		return " Did :"+did+" DName :"+dname;
	}
	
	public Dept(int did,String dname){
		
		this.did=did;
		this.dname=dname;
	}
	public boolean compareDept(Dept obj) {   //used id EmployeeClass2
		if(this.did==obj.did && this.dname==obj.dname)
			return true;
		else
			return
					false;
	}
}

