

import java.util.*;

class Employee{
	String name;
	int id; 
	double salary;
	
	Employee(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("salary: "+salary);
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary, int teamSize){
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("role   : manager");
		System.out.println("teamsize: "+teamSize);
	}
	
}

class Developer extends Employee{
	String programmingLang;
	Developer(String name,int id,double salary, String programmingLang){
		super(name,id,salary);
		this.programmingLang=programmingLang;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("role        : developer");
		System.out.println("programming language: "+programmingLang);
	}
	
}


class Intern extends Employee{
	int months;
	Intern(String name,int id,double salary, int months){
		super(name,id,salary);
		this.months=months;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("role        : intern");
		System.out.println("intern duration in months: "+months);
	}
	
}


public class EmployeeManagementSystem{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter employee type(manager/developer/intern):");
		String type=sc.nextLine();
		
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		sc.nextLine();
		
		Employee employee=null;
		
		switch (type) {
		case "manager":
			System.out.println("enter team size");
			int teamSize=sc.nextInt();
			employee=new Manager(name,id,salary,teamSize);
			break;
		case "developer":
			System.out.println("enter programming lanaguage");
String programming=sc.nextLine();
			employee=new Developer(name,id,salary,programming);
			break;
		case "intern":
			System.out.println("enter duration");
			int month=sc.nextInt();
			employee=new Intern(name,id,salary,month);
			break;
			
			default:
				System.out.println("invaild input");break;
			
			
		}
		
		System.out.println("employee details");
		employee.display();
		
	}
}
