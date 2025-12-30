import java.util.*;

public class Employee {
	
	String name;
	int id;
	int salary;
	
	public  void displayDetails() {
		System.out.println("the name of the employee is "+name);
		System.out.println("the id is "+ id);
		System.out.println("the salary is "+salary);
	}
	
	public static void main(String args[]) {
		Employee employee=new Employee();
		
		employee.name="Riddhi";
		employee.id=24;
		employee.salary=50000;
		
		employee.displayDetails();
		
		
	}
}
