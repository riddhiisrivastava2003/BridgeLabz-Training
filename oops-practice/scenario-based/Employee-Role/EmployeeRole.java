import java.util.Scanner;

public class EmployeeRole{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter employee role (manager/developer): ");
        String role = sc.next();

        System.out.print("enter employee name: ");
        String name = sc.next();

        System.out.print("enter salary: ");
        double salary = sc.nextDouble();

        Employee employee;

        if (role.equalsIgnoreCase("manager")) {
            employee = new Manager(name, salary);
        } else if (role.equalsIgnoreCase("developer")) {
            employee = new Developer(name, salary);
        } else {
            System.out.println("invalid role");
            sc.close();
            return;
        }

        System.out.printf("bonus: %.2f%n", employee.getBonus());

        sc.close();
    }
}