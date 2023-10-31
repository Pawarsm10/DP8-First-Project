package com.arrayofobjects.assignment;

import java.util.Arrays;
/*
 * 3.	Create class Dept(did, dname), class MyDate(day, month, year)
   a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
   Create array of Employee and display the array elements.
   4.	Same as above but print Employees whose dept_name is same.
 */
class Employee2{
	
	int eid;
	String ename;
	Dept dept;
	MyDob dob;
	
	public String toString() {
		
		return "\nID :"+eid+" Name :"+ename+" Department :"+dept+" Date OF Birth :"+dob;
	} 
	
	Employee2(int eid,String ename, Dept dept,MyDob dob){
		this.eid=eid;
		this.ename=ename;
		this.dept=dept;
		this.dob=dob;
	}
}

public class EmployeeClass2 {

	public static void main(String[] args) {
		Employee2 [] emp2= new Employee2[2];
		Dept dept1=new Dept(11,"Mech");
		MyDob dob1=new MyDob(10,05,1995);
		
		emp2[0]=new Employee2(2001,"Yuvi",dept1,dob1);
		
		Dept dept2=new Dept(11,"Mech");
		MyDob dob2=new MyDob(20,04,1994);
		
		emp2[1]=new Employee2(1001,"Viru",dept2,dob2);
		
		//System.out.println(Arrays.toString(emp2));
		System.out.println("==============================================================");
		for(int i=0;i<emp2.length;i++) {  
			
			for(int j=0;j<emp2.length;j++) {
				
				if(emp2[i].dept.compareDept(emp2[j].dept) && i!=j) {  //Object Comparison...see Dept class
					System.out.println(emp2[i]);
					break;
				}
			}
		/**	if(dept1.dname==dept2.dname) {
				System.out.println("same dept boys are :"+e.ename);
			}
		*/	
		}
		System.out.println("----------------------------------------------------------------------");

		for(Employee2 e:emp2) {
		if(e.dept.dname.equals("Mech")) {
			System.out.println("Mech boys are : "+e.ename);
		}
		}

	}

}
