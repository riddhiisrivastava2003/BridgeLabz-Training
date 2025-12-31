

import java.util.*;


public  class Employee {
	 
	 public int employeeID;
	 protected String department;
	 private double salary;
	 
	 public Employee(int employeeID,String department,double salary) {
		 this.employeeID=employeeID;
		 this.department=department;
		 this.salary=salary;
		 
		 
	 }
	 
	 public void setSalary(double salary) {
		 this.salary=salary;
	 }
	 
	 public double getSalary() {
		 return salary;
	 }
	 
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter employee id");
		 int id=sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.println("enter department ");
		 String dept=sc.nextLine();
		 
		 System.out.println("enter salary");
		 double salary=sc.nextDouble();
		 
		 Manager manager=new Manager(id,dept,salary);
		 
		 manager.display();
		 
		 System.out.println("enter new salary");
		 double newSalary=sc.nextDouble();
		 
		 manager.setSalary(newSalary);
		 
		 System.out.println("updated salary "+manager.getSalary());
		 
	 }
	 

}
 
 class Manager extends Employee{
	 public Manager(int employeeID,String department,double salary) {
		 super(employeeID,department,salary);
	 }
	 
	 public void display() {
		System.out.println("employee id "+employeeID);
		System.out.println("department "+department);
		System.out.println("salary "+getSalary());
	 }
	 
	
 }
 

 
 
