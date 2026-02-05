import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name ;
    private String department;
    private double salary;



    public Employee(String name,String department , double salary){
        this.name = name;
        this.department =department;
        this.salary = salary;

    }

    public String getName(){
        return name;

    }
    public String getDepartment(){
        return department;

    }
    public double getSalary(){
        return salary;
}

}


public class EmployeeSalaryCategorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>() ;

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee "+(i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();


            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            employees.add(new Employee(name, department, salary));
        }

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

   
        System.out.println("----Average Salary by Department----") ;
        avgSalaryByDept.forEach((dept,avgSalary)->System.out.println(dept + " -> " + avgSalary));

        
    }
    
}
