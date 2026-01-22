import java.time.LocalDate;
import java.util.Scanner;

public class InsurancePolicyManagementSystemMain {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        PolicyManager  manager = new PolicyManager();

        while (true) {

            System.out.println("\n----insurance policy management system----");
            System.out.println("1. add policy");
            System.out.println("2. get policy by number");
            System.out.println("3. policies expiring in 30 days");
            System.out.println("4. policies by policy holder");
            System.out.println("5. remove expired policies");
            System.out.println("6. display all policies");
            System.out.println("7. exit");
            System.out.print("wnter choice : ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("enter policy number : ");
                    String number = sc.nextLine();
                    System.out.print("enter policy holder name : ");
                    String holder = sc.nextLine();

                    System.out.print("enter expiry date (yyyy-mm-dd) : ");
                    LocalDate expiry = LocalDate.parse(sc.nextLine()) ;
                    manager.addPolicy(new Policy(number, holder, expiry));
                    

                    System.out.println("policy added...");
                    break;

                case 2:
                	
                    System.out.print("enter policy number : ") ;
                    Policy policy = manager.getPolicyByNumber(sc.nextLine());

                    System.out.println(policy != null ? policy : "policy not found");
                    break;

                case 3:
                    System.out.println("policies expiring in next 30 days:");
                    manager.getPoliciesExpiringSoon().forEach(System.out::println);
                    break;

                case 4:
                	
                    System.out.print("enter policy holder name: ");
                    manager.getPoliciesByHolder(sc.nextLine())
                           .forEach(System.out::println);
                    break;

                case 5:
                	
                    manager.removeExpiredPolicies();
                    System.out.println("expired policies removed");
                    break;

                case 6:
                    manager.displayAllPolicies();
                    break;

                case 7:
                	
                    System.out.println("exiting system...");
                    sc.close();
                    return;



                default:
                    System.out.println("invalid choice");
            }
        }
    }
}