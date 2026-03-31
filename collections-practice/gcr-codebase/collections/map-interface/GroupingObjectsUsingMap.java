import java.util.*;

enum Department{
    HR, IT, FINANCE, SALES
}

class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class GroupingObjectsUsingMap{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nenter details for employee "+(i+1));

            System.out.print("enter name: ");
            String name = sc.nextLine();

            // System.out.print("enter department (hr/it/finance/sales): ");
            // String deptInput = sc.nextLine().toUpperCase();
            // Department department = Department.valueOf(deptInput);
            // employees.add(new Employee(name, department));

            Department department=null;

            while(department==null){

                System.out.print("enter department (hr/it/finance/sales): ");
                String deptInput = sc.nextLine().toUpperCase();

                try{
                    department = Department.valueOf(deptInput);
                }
                catch(IllegalArgumentException e){
                    System.out.println("invalid department");
                }



            }

            employees.add(new Employee(name, department));
        }

        Map<Department, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap
                    .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                    .add(emp);
        }

        System.out.println("\nemployees grouped by department:");
        for (Map.Entry<Department, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        
    }
}