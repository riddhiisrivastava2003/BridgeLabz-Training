import java.util.*;
public class PrimeNumberChecker{
    public static boolean primeCheck(int number){
        if(number<=1){
            return false;
        }

        for(int i=2;i<=number/2;i++){
            if(number % i==0) return false;
        }

        return true;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int number=sc.nextInt();

        if(primeCheck(number)){
            System.out.println("number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
}