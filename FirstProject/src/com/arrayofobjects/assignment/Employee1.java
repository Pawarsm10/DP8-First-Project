package com.arrayofobjects.assignment;
/*
 * WAP to print the employees from Employee[] array who has same joining date. 
 * You have Employee class which has 4 attributes id, name, salary, 
 * date (date is another object which has 3 attributes day, month, year) and 
 * add employee objects to your array
 */
public class Employee1 {

	int id;
	String name;
	int salary;
	Date d;
	
	Employee1(){};
	Employee1(int id,String name,int salary,Date d){
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}
	public static void main(String[] args) {


		Employee1 [] emp1=new Employee1[3];
		Date d1=new Date(10,11,2023);
		emp1[0]=new Employee1(10,"Viru",5000,d1);
		
		Date d2=new Date(11,11,2023);
		emp1[1]=new Employee1(11,"Rahul",4000,d2);
		
		Date d3=new Date(10,11,2023);
		emp1[2]=new Employee1(12,"Laxman",4000,d3);

	/*	if(d1.dd==d2.dd && d1.mm==d2.mm && d1.yy==d2.yy)
			System.out.println(emp1[0].name+" has same date of birth as "+emp1[1].name);
		else if(d2.dd==d3.dd  && d2.mm==d3.mm && d2.yy==d3.yy)
			System.out.println(emp1[1].name+" has same date of birth as "+emp1[2].name);
		else if(d1.dd==d3.dd  && d1.mm==d3.mm && d1.yy==d3.yy)
			System.out.println(emp1[0].name+" has same date of birth as "+emp1[2].name);
		else
		
			
		System.out.println("No one has same DOB");
		*/
		for(int i=0;i<emp1.length;i++) {            //Object comparison *see Date class
			for(int j=0;j<emp1.length;j++) {
				
				if(emp1[i].d.compareDate(emp1[j].d) && i!=j ) {
					System.out.println(emp1[i]);
					break;
					
					
				}
			}
		}
	/*	System.out.println("=============================");
		for(int i=0;i<emp1.length;i++) {
			for(int j=i+1;j<emp1.length;j++) {
				
				if(emp1[i].d.dd==emp1[j].d.dd && emp1[i].d.mm==emp1[j].d.mm && emp1[i].d.yy==emp1[j].d.yy) {
					//System.out.println(emp1[j]);
					System.out.println(emp1[i]);
					
				}
			}
		}*/
	}
}
