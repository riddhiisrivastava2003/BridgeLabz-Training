
import java.util.*;


public class Employee {
	
	private static String companyName="Angaar Batch";
	private final int id;
	private String name;
	private String designation;
	private static int totalEmployees=0;
	
	public Employee(int id, String name, String designation) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		totalEmployees++;
		
	}
//	public static void displayCompanyName() {
//		System.out.println("Angaar Batch");
//	}
	
	public static void displayTotalEmployees() { 
		System.out.println("the total number of employees are "+totalEmployees);
		
		
	}
	
	
	public  void displayEmployeeDetails() {
		if(this instanceof Employee) {
			System.out.println("company name: "+companyName);
			
			System.out.println("employee id: "+id);
			System.out.println("name: "+name);
			System.out.println("designation: "+designation);
			
		}else {
			System.out.println("invalid employee");
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of employees");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		Employee[] employee=new Employee[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter employee details "+(i+1));
			
			System.out.println("enter employee id");
			int id=sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("name: ");
			String name=sc.nextLine();
			
			System.out.println("enter designation ");
			String designation=sc.nextLine();
			
			employee[i]=new Employee(id,name,designation);
		}
		
		System.out.println();
		Employee.displayTotalEmployees();
		
		for(int i=0;i<n;i++) {
			employee[i].displayEmployeeDetails();
		}
		
		
		
	}
	

	
}
