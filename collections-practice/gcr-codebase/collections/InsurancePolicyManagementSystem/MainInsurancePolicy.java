import java.util.*;
import java.time.LocalDate;

public class MainInsurancePolicy{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        PolicyServices ps=new PolicyServices();

        System.out.println("enter number of policies");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("enter policy number");
            int policyNumber=sc.nextInt();
            sc.nextLine();

            System.out.println("enter holder name");
            String holderName=sc.nextLine();

            System.out.println("enter expiry date(yyyy-mm-dd)");
            String date=sc.nextLine();

            System.out.println("enter premium");
            double premium=sc.nextDouble();
            sc.nextLine();

            System.out.println("enter coverage type");
            String coverageType=sc.nextLine();

            Policy p=new Policy(policyNumber,holderName,LocalDate.parse(date),premium,coverageType);
            ps.addPolicy(p);
        }

        ps.displayAll();
        ps.expiringSoon();


        System.out.println("enter coverage type");
        String filter=sc.nextLine();
        ps.filterByCoverage(filter);

        ps.showSortedByExpiry();

       PerformanceTest.testPerformance();
    

            
    }
}