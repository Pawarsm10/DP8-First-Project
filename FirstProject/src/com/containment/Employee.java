package com.containment;
//ContaintMent
public class Employee {
	
	private int eid;
	private String name;
	private MyDate doj;
	
	Employee(){
		eid=01;
		name="John";
		doj=new MyDate();
	}
	Employee(int eid,String name,MyDate d) {
		
		this.eid=eid;
		this.name=name;
		this.doj=d;
	}
	

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDoj() {
		return doj;
	}
	public void setDoj(MyDate doj) {
		this.doj = doj;
	}
	
	public String toString() {
		return "\nEID = "+eid+" NAME = "+name+" DOJ = "+doj;
	}
	public static void main(String[] args) {


		Employee obj=new Employee();
		System.out.println(obj);
		MyDate d=new MyDate(10,10,2023);
		
		Employee obj1=new Employee(101,"Kusum",d);
		System.out.println(obj1);
		//System.out.println(d.getDd());
		
		Employee obj2=new Employee();
		obj2.setDoj(new MyDate(20,10,2023));
		obj2.setEid(201);
		obj2.setName("Hardik");
		System.out.println(obj2);
		
		int eid=obj.getEid();
		String name=obj.getName();
		MyDate doj=obj.getDoj();
		System.out.println(eid+"/"+name+"/"+doj);

	}

}
