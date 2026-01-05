import java.util.*;

interface Department{
    void assignDepartment(String departementName);

    String getDepartmentDetails();

}

abstract class Employee implements Department{
    private int empID;
    private String empName;
    private double baseSalary;
    private String department;

    public Employee(int empID, String empName, double baseSalary){
        this.empID = empID;
        this.empName = empName;
        this.baseSalary = baseSalary;



    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("employee id: " +empID);
        System.out.println("employee name: " + empName);
        System.out.println("department: " + department);
        System.out.println("final salary: " + calculateSalary());
    }


    public int getEmployeeId(){
        return empID;

    }
    public String getEmployeeName(){

        return empName;
    }
    public double getBaseSalary(){

        return baseSalary;

    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }
    public String getDepartmentDetails(){


        return department;
    }



}

class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int empID , String empName , double baseSalary){
        super(empID, empName, baseSalary);

    }
    public double calculateSalary(){
        return getBaseSalary();

    }
}

class PartTimeEmployee extends Employee{

    private int workingHours;
    private double hourlyRate;

    public  PartTimeEmployee(int empID, String empName , int workingHours, double hourlyRate){

        super(empID, empName , 0);
        this.workingHours = workingHours;

        this.hourlyRate = hourlyRate;

    }
    public double calculateSalary(){
        return workingHours * hourlyRate;
    }
}


public class EmployeeManagement{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("enter number of employees: ");
        int totalEmployees = scanner.nextInt();

        for (int i = 1;i<=totalEmployees;i++){

            System.out.println("\nemployee " + i);
            System.out.println("1. full time employee ");

            System.out.println("2. part time employee ");
            System.out.print("choose employee type: ");
            int choice = scanner.nextInt();

            System.out.print("enter employee id: ");

            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name : ");

            String name = scanner.nextLine();

            System.out.print("Enter Department Name : ");

            String department = scanner.nextLine();

            if (choice == 1){
                System.out.print("Enter Base Salary: ");
                double salary = scanner.nextDouble();

                Employee fullTimeEmployee = new FullTimeEmployee(id, name, salary);
                fullTimeEmployee.assignDepartment(department);
                employeeList.add(fullTimeEmployee);

            } else if (choice == 2){
                System.out.print("Enter Working Hours: ");

                int hours = scanner.nextInt();

                System.out.print("Enter Hourly Rate: ");

                double rate = scanner.nextDouble();

                Employee partTimeEmployee = new PartTimeEmployee(id, name, hours, rate);
                partTimeEmployee.assignDepartment(department);
                employeeList.add(partTimeEmployee);

            } else{
                System.out.println("Invalid choice !!!!");
            }
        }

        System.out.println("Employee Details");


        for (Employee employee : employeeList){

            employee.displayDetails();
        }

        scanner.close();
    }
}