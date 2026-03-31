import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis{

    static class Claim{

        String claimType;
        double amount;

        Claim(String claimType, double amount){
            this.claimType=claimType;
            this.amount=amount;
        }

        public String getClaimType(){
            return claimType;
        }

        public double getAmount(){
            return amount;
            
        }
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        List<Claim> claims=new ArrayList<>();

        System.out.println("Enter number of claims: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter claim type: ");
            String claimType=sc.nextLine();

            System.out.println("Enter claim amount: ");
            double amount=sc.nextDouble();
            sc.nextLine();

            claims.add(new Claim(claimType,amount));

        }

        System.out.println("Average Claim Amount per Claim Type: ");
        Map<String, Double> avgClaimAmount=
        claims.stream()
        .collect(Collectors.groupingBy(Claim::getClaimType,
            Collectors.averagingDouble(Claim::getAmount)
        ));

        avgClaimAmount.forEach((type,avg)->
        System.out.println("Type -> "+type+" | Average Amount ->"+avg));
        
    }
}