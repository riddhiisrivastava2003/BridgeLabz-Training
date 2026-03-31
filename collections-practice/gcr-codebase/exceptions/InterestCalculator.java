import java.util.*;

public class InterestCalculator{
public static double calculateInterest(double amount, double rate, int time) throws IllegalArgumentException{

        if(amount <0||rate<0){
            throw new IllegalArgumentException("amount and rate cannot be negative");
        
        }

        return (amount*rate*time)/100;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        try{

            System.out.print("enter amount: ");
            double amount=sc.nextDouble();

            System.out.print("enter rate: ");
            double rate=sc.nextDouble();

            System.out.print("enter time: ");
            int time=sc.nextInt();

            double interest=calculateInterest(amount,rate,time);
            System.out.println("interest: "+interest);
        }
        catch(IllegalArgumentException e){
            System.out.println("invalid input: amount and rate must be positive");
        
        }
    }
}